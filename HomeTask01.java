import java.util.Scanner;

public class HomeTask01                 //числа Фиббоначи
{
    public static void main(String[] args)
    {
        int i=0;
        boolean flag = true;
        long fib[] = new long[40];

        fib[0] = 0;
        fib[1] = 1;

        while (flag)
        {
            if (i == 0 || i ==1) System.out.printf(" %d %n", fib[i]);
            else
            {
                fib[i] = fib[i - 1] + fib[i - 2];
                if (fib[i]<10000000)
                {
                    System.out.printf(" %d %n", fib[i]);
                }
                else flag = false;
            }
         i++;
        }
    }
}
