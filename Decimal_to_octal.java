import java.util.Scanner;



public class Decimal_to_octal {
    public static String get(int decimal){
        int rem;
        String octal="";
        char octalchars[]={'0','1','2','3','4','5','6','7'};
        while(decimal>0)
        {
            rem=decimal%8;
            octal=octalchars[rem]+octal;
            decimal=decimal/8;
        }
        return octal;
    }
    public static void main(String args[]){
Scanner s=new Scanner(System.in);
           int n=s.nextInt();
            System.out.println(get(n)); }}
