import java.util.Scanner;

public class Binary_to_decimal {

        public static int get(int binary){
            int decimal = 0;
            int n = 0;
            while(true){
                if(binary == 0){
                    break;
                } else {
                    int temp = binary%10;
                    decimal += temp*Math.pow(2, n);
                    binary = binary/10;
                    n++;
                }
            }
            return decimal;
        }
        public static void main(String args[]) {
           Scanner s=new Scanner(System.in);
           int n=s.nextInt();
            System.out.println(get(n));
        }
}
