import java.util.Scanner;

public class InvertedHourGlass_Pattern_14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num=n;
        int space=0;
        for (int i = 1; i <= 2*n+1; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = num; j >=0 ; j--) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <=num; j++) {
                System.out.print(j+" ");
            }
            if(i>=n+1) {
                space -= 2;
                num++;
            }
            else
            {
                space += 2;
                num--;
            }
            System.out.println();
        }
    }
}
