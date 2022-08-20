import java.util.Scanner;

public class fibannoic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3;

        if (n == 0 || n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("0");
            System.out.println("1");

        } else {
            System.out.println(f1);
            System.out.println(f2);
            while (n - 2 > 0) {
                f3 = f1 + f2;
                System.out.println(f3);
                f1 = f2;
                f2 = f3;
                n--;
            }
        }
    }
}
