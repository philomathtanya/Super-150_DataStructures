import java.util.Scanner;

public class Mountain_Pattern_15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int space=3*n-2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            for (int j = 0; j <space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                if(j!=n)
                System.out.print(j+" ");
            }
            space-=4;
            System.out.println();

        }
    }
}
