import java.util.Scanner;

public class Magic_Pattern_20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int top = n;
        int mspace = -1;
        for (int i = 0; i < 2*n-1; i++) {
            if (i == 0 || i==2*n-2)
                for (int j = 0; j < 2 * n - 1; j++) {
                    System.out.print("*");
                }
            else {
                for (int j = 0; j < top; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < mspace; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < top; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
            if (i >= n - 1) {
                top++;
                mspace -= 2;
            } else {
                top--;
                mspace += 2;
            }

        }
    }
}
