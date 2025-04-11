
package exam;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam2
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("input here:");

            String pw = sc.nextLine();

            int length_flag = 1;
            //6文字以上か
            int pw_len = pw.length();
            if(pw_len >= 6)
            {
                System.out.println("文字数クリア");
                length_flag = 0;
            }
            else
            {
                System.out.println("文字数エラー");
            }

            //パスワードは"半角英数字のみ"で構成されているか？
            String IndexAlphaNum = "^[A-Za-z0-9]+$";
            int Alphanum_flag = 1;
            if(Checklogic(IndexAlphaNum, pw))
            {
                System.out.println("半角英数クリア");
                Alphanum_flag = 0;
            }
            else
            {
                System.out.println("半角英数エラー");
            }

            //flagによる最終判別
            if((length_flag == 0)&&(Alphanum_flag == 0))
            {
                System.out.println("OK!");
            }
            else
            {
                System.out.println("ERROR!");
            }
        }

        public static boolean Checklogic(String regex, String target)
        {
            boolean result;
            if( target == null || target.isEmpty() ) return false ;
            // 3. 引数に指定した正規表現regexがtargetにマッチするか確認する
            Pattern p1 = Pattern.compile(regex); // 正規表現パターンの読み込み
            Matcher m1 = p1.matcher(target); // パターンと検査対象文字列の照合
            result = m1.matches(); // 照合結果をtrueかfalseで取得
            return result;
        }
    }
