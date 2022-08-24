import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int space=n-1;
        int num=1;
        int nd=n;
        for (int i = 0; i < n*2-1; i++) {
            if(i<=n-1) {
                for (int k = 0; k < space; k++) {
                    System.out.print("    ");
                }
                for (int k = i + 1; k <= num; k++) {
                    System.out.print(k + "   ");
                }
                for (int k = num - 1; k >= i + 1; k--) {
                    System.out.print(k + "   ");
                }


            }
            else
            {
                nd--;
                for (int k = 0; k < space; k++) {
                    System.out.print("    ");
                }
                for (int k =nd; k <= num; k++) {
                    System.out.print(k + "   ");
                }
                for (int k = num - 1; k >= nd; k--) {
                    System.out.print(k + "   ");
                }



            }
            if(i>=n-1)
            {
                System.out.println();
                space++;//4
                num -= 2;
            }
            else
            {
                System.out.println();
                space--;//4
                num += 2;
            }
        }
    }
}
