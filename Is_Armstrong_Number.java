import java.util.Scanner;
import java .math.*;
public class Is_Armstrong_Number {
    public static void arms(int n)
    {int count=0;
        int rem;
        int n2=n;
        int n3=n;
        int sum=0;
      while(n!=0){
          n=n/10;
          count++;

        }

        while (n2 != 0) {
            rem=n2%10;
            rem= (int) Math.pow(rem,count);
            sum+=rem;
            n2=n2/10;
        }
        if(sum==n3)
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        arms(n);
    }
}
