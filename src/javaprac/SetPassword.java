
package javaprac;
import java.util.Scanner;

public class SetPassword
    {
        public static void returnerror()
        {
            System.out.println("Error!");
        }

        public static boolean Checklogic(String input)
        {
            //6文字以上か？
            if(input.length() < 6)
            {
                System.out.println("文字数エラー");
                returnerror();
                return false;
            }

            //半角英数字以外が含まれていないか？
            if(!input.matches("[a-zA-Z0-9]+"))
            {
                System.out.println("半角英数字以外の文字が含まれています");
                returnerror();
                return false;
            }

            boolean hasAlphabet = input.matches(".*[a-zA-Z].*");
            boolean hasNumber = input.matches(".*[0-9].*");
            if(!hasAlphabet)
            {
                System.out.println("アルファベットが含まれていません");
                returnerror();
                return false;
            }

            if(!hasNumber)
            {
                System.out.println("数字が含まれていません");
                returnerror();
                return false;
            }

            System.out.println("OK!");
            return true;
        }

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input here:");
            String input = scanner.nextLine();

            Checklogic(input);
        }
    }
