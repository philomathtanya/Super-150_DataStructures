import java.util.Scanner;

public class Check_prime {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=0;

        for(int j=0;j<=n/2;j++)
        {
            if(n%3==0)
            {
                if(n==1 || n==3)
                {
                    t=0;
                }
                else{
                    t=1;
                }
            }
        }
        if(t==1)
        {
            System.out.print("Not Prime");
        }
        else{
            System.out.print("Prime");
        }


    }
}