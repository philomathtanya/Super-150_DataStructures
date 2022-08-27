import java.util.Scanner;

public class Print_Series {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int i=1;
        int j=1;
        while(i<=n1)
        {


            int t=3*j+2;
            j++;
            if(t%n2!=0)
            {
                System.out.println(t);
                i++;
            }
        }

    }
}