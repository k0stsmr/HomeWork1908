public class HomeTask02                 //простые числа
{
    public static void main(String[] args)
    {
        int simple = 2, count=0;
        boolean p;
        System.out.printf("Простые числа:%n");
        for (int i = 2 ; i <= 1000000 ; i++)
        {
            p = true;
            double sqrt_simple = Math.sqrt(i);
            for (int j = 2;j < i;j++)
            {
                if (i % j == 0)
                {
                    p = false;
                    break;
                }
                else
                {
                    simple = i;
                    if (j >= sqrt_simple) break; //ограничение вычислений по корню от простого числа
                }
            }
            if (p)
            {
                System.out.println(simple);
                count++;
            }
        }
        System.out.println("Всего чисел:" + count);
    }
}
