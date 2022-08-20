import java.util.Scanner;

public class Conversion_Fahrenheit_to_Celsius {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int start=s.nextInt();
            int end=s.nextInt();
            int gap=s.nextInt();
        int ans=0;
            while(start<end+1){
                System.out.print(start+" ");
                ans=5*(start-32)/9;
                System.out.print(ans);
                start+=gap;
                System.out.println();
            }
    }
}

