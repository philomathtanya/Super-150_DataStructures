
import java.util.Scanner;

public class Help_Ramu {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int n = sc.nextInt();// Rickshaw
            int m = sc.nextInt();// Cab
            int Rickshaws[] = new int[n];
            int Cabs[] = new int[m];
            for (int i = 0; i < Rickshaws.length; i++) {
                Rickshaws[i] = sc.nextInt();
            }
            for (int i = 0; i < Cabs.length; i++) {
                Cabs[i] = sc.nextInt();
            }
            int totalr = 0;
            int totalc = 0;
            for (int i = 0; i < Rickshaws.length; i++) {
                totalr += Math.min(Rickshaws[i] * c1, c2);
            }
            for (int i = 0; i < Cabs.length; i++) {
                totalc += Math.min(Cabs[i] * c1, c2);

            }
            totalr = Math.min(totalr, c3);
            totalc = Math.min(totalc, c3);
            int ans = Math.min(c4, totalc + totalr);
            System.out.println(ans);
        }
    }
}