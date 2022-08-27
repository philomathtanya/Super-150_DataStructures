import java.util.Scanner;

public class LCM {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n1;
        int n2;
        n1=s.nextInt();
        n2=s.nextInt();

        int div=n1;
        int divi=n2;
        int gcd=0;
        while(divi % div!=0)
        {
            int t=divi % div;

            divi=div;
            div=t;

        }
        gcd=div;
        int lcm=(n1*n2)/gcd;
        System.out.print(lcm);



    }

}
