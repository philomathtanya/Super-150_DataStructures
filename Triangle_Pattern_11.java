import java.util.Scanner;

public class Triangle_Pattern_11 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int space=n-1;
            int num=1;
            int nd=n;
            for (int i = 0; i < n; i++) {

                    for (int k = 0; k < space; k++) {
                        System.out.print("    ");
                    }
                for (int k = i+1; k <=num; k++) {
                    System.out.print(k+"   ");
                }
                for (int k = num-1; k >=i+1; k--) {
                    System.out.print(k+"   ");
                }

                System.out.println();
                space--;//4
                num+=2;

                }

                }}


