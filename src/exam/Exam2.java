
package exam;
import java.util.Scanner;

    public class Exam2
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("input here:");

            String pw = sc.nextLine();
            System.out.println("Echo " + pw);

            //長さの判別
            int pw_len = pw.length();
            int flag = 1;
            if(pw_len >= 6)
            {
                System.out.println("文字数クリア");
                flag = 0;
            }


            //flagによる最終判別
            if(flag == 0)
            {
                System.out.println("OK!");
            }
            else
            {
                System.out.println("ERROR!");
            }

        }
    }
