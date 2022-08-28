import java.util.Scanner;

public class Odd_and_Even_back_in_Delhi {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int k;
        k=s.nextInt();
        int n;


        while(k>0)
        {
            int s1=0;
            int s2=0;
            n=s.nextInt();
            while(n>0)
            {
                int rem=n%10;
                if(rem%2!=0)
                {
                    s2+=rem;
                }
                else{
                    s1+=rem;
                }
                n/=10;

            }
            if((s1%4==0)||(s2%3==0))
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            k--;
        }


    }
}
