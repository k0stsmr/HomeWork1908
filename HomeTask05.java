import java.util.Scanner;

public class HomeTask05 //является ли введённое число палиндромом
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число, а я его проверю ->");
        String big = input.next();

        int l = big.length();
        int[] full = new int[l];
        boolean p=false;
        for (int i = 0 ; i < l ; i++)
        {
            full[i] = big.charAt(i);
        }

        for (int j = 0 ; j < l ; j++)
        {
            p = false;
            if (full[j] != full[l-1-j]) break;
            else p = true;
        }
        if (p) System.out.println("YES");
        else  System.out.println("NO!");
    }
}
