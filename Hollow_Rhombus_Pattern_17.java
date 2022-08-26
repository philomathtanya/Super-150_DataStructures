import java.util.Scanner;

public class Hollow_Rhombus_Pattern_17 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=n;
        int space=n-1;
        for (int i = 1; i <= 2*n-1; i++) {
            if (i % 2 == 0)
                System.out.println();
            else {

                for (int j = 0; j < space; j++) {
                    System.out.print(" ");
                }

                if (i == 1 || i == 2 * n - 1) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int j = 0; j <n-2; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");

                }
                space--;
                System.out.println();
            }
        }
    }
}