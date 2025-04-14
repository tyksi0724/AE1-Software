package exam;
import java.util.Random;
import java.util.Scanner;

public class Exam3_GuessNumber
{
    public static void main(String[] args)
    {
        //乱数の生成
        Random rand = new Random();
        int num = rand.nextInt(10);

        //正誤判定ループ
        while(Checkrogic(num));

    }

    public static boolean Checkrogic(int ans)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess: ");
        int x = Integer.parseInt(input.nextLine()); //文字列をintに変換

        if(x == ans)
        {
            System.out.println("You guessed its number!");
            return false;
        }
        else
        {
            System.out.println("You lost its number!");
            if(x > ans)
            {
                System.out.println("high");
            }
            else
            {
                System.out.println("low");
            }
            return true;
        }
    }
}
