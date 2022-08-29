import java.util.Scanner;

public class Octal_to_decimal {
    public static int get(int octal){
        int decimal = 0;
        int n = 0;
        while(true){
            if(octal == 0){
                break;
            } else {
                int temp = octal%10;
                decimal += temp*Math.pow(8, n);
                octal = octal/10;
                n++;
            }
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(get(n));

    }}

