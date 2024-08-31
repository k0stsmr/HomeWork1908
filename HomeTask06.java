public class HomeTask06                 //Восьмизначные числа без повторяющихся цифр, кратные 12345
{
    public static void main(String[] args)
    {
        int count = 0;
        boolean uniq = false;
        String numeric8String;

        System.out.printf("Числа:%n");
        for (int i = 10000000 ; i < 100000000 ; i++)
        {
            numeric8String = String.valueOf(i);
            int repeat = 0;
            for (int j = 0 ; j <= 6 ; j++)
            {
                for (int k = j+1 ; k <= 7 ; k++)
                {
                   if (numeric8String.charAt(j) == numeric8String.charAt(k))
                   {
                       uniq = false;
                       repeat++;
                       break;
                   }
                   else
                   {
                       if (j == 6 && repeat == 0) uniq = true;
                   }
                }
            }
            if (uniq && (i % 12345 == 0))
            {
                count++;
                System.out.println("Число:" + i);
            }
        }
        System.out.println("Всего чисел:" + count);
    }
}
