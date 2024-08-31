import java.util.Scanner;

public class HomeTask04                 //Совершенные числа
{
    public static void main(String[] args)
    {
        int ideality=1;
        int limon = 0;

        System.out.printf("Совершенные числа:%n");
        for (int i = 1;ideality < 100000;i++) //при 100 000 выполнение 20-21 секунда.
        {
            int sumDel=0;
            ideality = i;

            for (int j = 1;j < ideality;j++)
            {
                if (ideality % j == 0)
                {
                    sumDel += j;
                }
            }
            if (ideality == sumDel) System.out.println(sumDel);
        }
    }
}