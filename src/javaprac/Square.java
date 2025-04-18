package javaprac;

public class Square
{
    int size; // 大きさ
    char ch;    // 描画文字

    int getArea()
    {
        return size * size;
    }
    void draw()
    {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}


