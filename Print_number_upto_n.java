import java.util.Scanner;
//print number upto n
public class Print_number_upto_n {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Number : ");
            int n=s.nextInt();
            reverse(n);
        }
        public static void reverse(int n){
            if(n==0){
                return ;
            }

            reverse(n-1);
            System.out.println(n);
        }
    }

