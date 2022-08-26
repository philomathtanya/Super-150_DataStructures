import java.util.Scanner;

public class Zeros_Pattern_18 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if(j==1 || j==i)
                {
                    System.out.print(i+" ");
                }
                else
                    System.out.print("0"+" ");
            }
            System.out.println();
        }
    }
}
