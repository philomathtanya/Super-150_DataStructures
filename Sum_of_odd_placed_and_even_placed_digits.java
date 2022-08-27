import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int o=0;
        int e=0;

        while(n>0)
        {
            int rem=n%10;
            if(i%2!=0)
            {
                o+=rem;
            }
            else{
                e+=rem;
            }
            i++;


            n/=10;



        }
        System.out.println(o);
        System.out.println(e);
    }

}
