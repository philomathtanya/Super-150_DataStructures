
import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nop = sc.nextInt();
        int noc = sc.nextInt();
        int[] rank = new int[noc];
        for (int i = 0; i < rank.length; i++) {
            rank[i] = sc.nextInt();
        }
        Arrays.sort(rank);
        System.out.println(minimumtime(rank, nop));
    }
    public static int minimumtime(int[] ranks, int no_Parantha) {
        int low = 0;
        int High = (ranks[ranks.length - 1] * (no_Parantha * (no_Parantha + 1))) / 2;
        int ans = 0;
        while (low <= High) {
            int mid = (low + High) / 2;
            if (isitpossible(ranks, mid, no_Parantha)) {
                ans = mid;
                High = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] rank, int mid, int nop) {
        int paratha = 1;
        int totaltime = 0;
        int total_parantha = 0;
        int i = 0;
        while (i < rank.length) {
            if (totaltime + paratha * rank[i] <= mid) {
                totaltime = totaltime + paratha * rank[i];
                paratha++;
                total_parantha++;
            } else {
                i++;
                paratha = 1;
                totaltime = 0;
            }
            if (total_parantha == nop) {
                return true;
            }
        }
        return false;
    }
}