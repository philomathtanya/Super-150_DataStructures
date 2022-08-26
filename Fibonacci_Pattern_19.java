import java.util.Scanner;

public class Fibonacci_Pattern_19 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n;
            n = s.nextInt();
            int f1 = 0;
            int f2 = 1;
            int f3=0;

//                System.out.println(f1);
//                System.out.println(f2);
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <= i; j++) {
                        if(i==2 && j==1){
                            System.out.print("1"+" ");
                        }
                        else
                        {
                        System.out.print(f3+" ");
                        f3 = f1 + f2;

                        f1 = f2;
                        f2 = f3;


                }}
                System.out.println();
            }
    }

}