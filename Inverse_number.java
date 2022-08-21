import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class Inverse_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        int p=0;
        int i=1;
        int sum=0;
     while (num!=0)
     {
         p=num%10;

         num=num/10;
         sum+= (int) (i* Math.pow(10,p-1));
         p=0;
         i++;
     }
        System.out.println("inverse: "+sum);
    }
}
