import java.util.Scanner;

public class Power_using_Recursion {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Digit : ");
            int n=s.nextInt();
            System.out.print("Power : ");
            int p=s.nextInt();
            System.out.println(fact(n,p));
        }
        public static int fact(int n,int p)
        {
            if(p==1){
                return n;
            }
            return n*fact(n,p-1);
        }
    }

