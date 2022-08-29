import java.util.Scanner;

public class Any_to_Any_Conversion{
    public static int conversion(int num, int sb, int db){
        int ans = 0;
        int mult = 1;
        while(num != 0){
            int rem = num % 10;
            ans  = ans + rem * mult;
            mult = mult * sb;
            num = num / 10;
        }
        mult = 1;
        num = ans;
        ans = 0;
        while(num != 0){
            int rem = num % db;
            ans  = ans + rem * mult;
            mult = mult * 10;
            num = num / db;
        }
        return ans;
    }

    public static void main(String[] args) {
        int src, dest,sn;
        Scanner s=new Scanner(System.in);
        src=s.nextInt();
        dest=s.nextInt();
        sn=s.nextInt();
        System.out.println(conversion(sn, src, dest));
    }
}