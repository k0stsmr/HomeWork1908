import java.util.Scanner;

public class HomeTask03                 //числа Армстронга
{

    public static void main(String[] args)
    {
        int arm=1, ll;
        int arm1, arm10, arm100, arm1000, arm10000, arm100000, sum_arm = 0;
        System.out.printf("Числа Армстронга:%n");
        for (int i = 10;arm < 1000000;i++)
        {
            arm = i;
            ll = dlina(arm);

            for (int j = 1;j <= ll;j++)
            {
                switch (ll)
                {
                    case 1:
                        arm1 = arm % 10;
                        sum_arm = (int) Math.pow(arm1,ll);
                        break;
                    case 2:
                        arm10 = (int) (arm / 10);
                        arm1 = arm % 10;
                        sum_arm = (int) (Math.pow(arm10,ll) + Math.pow(arm1,ll));
                        break;
                    case 3:
                        arm100 = (int) (arm / 100);
                        arm10 = (int) ((arm % 100) / 10);
                        arm1 = arm % 10;
                        sum_arm = (int) (Math.pow(arm100,ll) + Math.pow(arm10,ll) + Math.pow(arm1,ll));
                        break;
                    case 4:
                        arm1000 = (int) (arm / 1000);
                        arm100 = (int) (arm % 1000 / 100);
                        arm10 = (int) (arm % 1000 % 100 / 10);
                        arm1 = arm % 10;
                        sum_arm = (int) (Math.pow(arm1000,ll) + Math.pow(arm100,ll) + Math.pow(arm10,ll) + Math.pow(arm1,ll));
                        break;
                    case 5:
                        arm10000 = (int) (arm / 10000);
                        arm1000 = (int) (arm % 10000 / 1000);
                        arm100 = (int) (arm % 10000 % 1000 / 100);
                        arm10 = (int) (arm % 10000 % 1000 % 100 / 10);
                        arm1 = arm % 10;
                        sum_arm = (int) (Math.pow(arm10000,ll) + Math.pow(arm1000,ll) + Math.pow(arm100,ll) + Math.pow(arm10,ll) + Math.pow(arm1,ll));
                        break;
                    case 6:
                        arm100000 = (int) (arm / 100000);
                        arm10000 = (int) (arm % 100000 / 10000);
                        arm1000 = (int) (arm % 100000 % 10000 / 1000);
                        arm100 = (int) (arm % 100000 % 10000 % 1000 / 100);
                        arm10 = (int) (arm % 100000 % 10000 % 1000 % 100 / 10);
                        arm1 = arm % 10;
                        sum_arm = (int) (Math.pow(arm100000,ll) + Math.pow(arm10000,ll) + Math.pow(arm1000,ll) + Math.pow(arm100,ll) + Math.pow(arm10,ll) + Math.pow(arm1,ll));
                        break;
                }
            }
            if (arm == sum_arm) System.out.println(sum_arm);
        }
    }
    public static int dlina(int num)
    {
        int full = Math.abs(num), l=1;
        //if(full <= 10) l = 1;
        if(full / 10 >= 1) l = 2;
        if(full / 100 >= 1) l = 3;
        if(full / 1000 >= 1) l = 4;
        if(full / 10000 >= 1) l = 5;
        if(full / 100000 >= 1) l = 6;
        if(full / 1000000 >= 1) l = 7;
        if(full / 10000000 >= 1) l = 8;
        if(full / 100000000 >= 1) l = 9;
        if(full / 1000000000 >= 1) l = 10;
        return l;
    }
}