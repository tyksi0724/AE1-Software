package javaprac;

public class SquareTest
{
    public static void main(String[] args)
    {
        System.out.println("--- s1 ---");
        Square s1 = new Square();
        s1.size = 5;
        s1.ch = '*';
        System.out.println("Area: " + s1.getArea());
        s1.draw();

        System.out.println("--- s2 ---");
        Square s2 = new Square();
        s2.size = 3;
        s2.ch = 'X';
        System.out.println("Area: " + s2.getArea());
        s2.draw();

        System.out.println("--- s3 ---");
        Square s3 = new Square();
        s3.size = 6;
        s3.ch = '+';
        System.out.println("Area: " + s3.getArea());
        s3.draw();

        System.out.println("--- s4 ---");
        Square s4 = new Square();
        s4.size = 7;
        s4.ch = '@';
        System.out.println("Area: " + s4.getArea());
        s4.draw();
    }
}
