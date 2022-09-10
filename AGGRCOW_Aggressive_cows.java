
import java.util.Arrays;
import java.util.Scanner;

public class AGGRCOW_Aggressive_cows {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int no_Stalls = sc.nextInt();
        int no_cows = sc.nextInt();
        int[] stall = new int[no_Stalls];
        for (int i = 0; i < stall.length; i++) {
            stall[i] = sc.nextInt();
        }

        Arrays.sort(stall);
        System.out.println(LargeMinDistance(stall, no_cows));



    }

    public static int LargeMinDistance(int[] stall, int noc) {
        int low = 0;
        int high = stall[stall.length - 1] - stall[0];// 9-1
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possiable(stall, mid, noc) == true) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;

    }

    public static boolean possiable(int[] stall, int mid, int noc) {

        int cows = 1;
        int position = stall[0];
        int i = 1;
        while (i < stall.length) {
            if (stall[i] - position >= mid) {
                cows++;
                position = stall[i];

            }

            if (cows == noc) {
                return true;
            }
            i++;

        }
        return false;

    }

}