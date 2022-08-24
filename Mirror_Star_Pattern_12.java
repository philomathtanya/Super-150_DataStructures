import java.util.Scanner;

public class Mirror_Star_Pattern_12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int space=(n/2)-1 ;
        int star=1;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=space; j++) {
                System.out.print("    ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*" + "   ");
            }

            System.out.println();
            if (i >= n / 2) {
                space++;
                star -= 2;
            } else {
                space--;
                star += 2;
            }
        }
    }
}
