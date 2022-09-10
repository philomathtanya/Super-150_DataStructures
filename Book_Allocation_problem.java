import java.util.Scanner;
public class Book_Allocation_problem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        while(test--!=0) {
            int n = s.nextInt();
            int noofst= s.nextInt();
            int pages[] = new int[n];
            for (int i = 0; i < n; i++) {
                pages[i] = s.nextInt();
            }
            System.out.println(minpage(pages, noofst));
        }
    }
    public static int minpage(int[] page, int noofst) {
        int hi = 0;
        for (int i = 0; i < page.length; i++) {
            hi += page[i];
        }
        int lo = 0;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (possible(page, mid, noofst) == true) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    private static boolean possible(int[] page, int mid, int noofst) {
        int s = 1;
        int reapapge = 0;
        int i = 0;
        while (i < page.length) {
            if (reapapge + page[i] <= mid) {
                reapapge += page[i];
                i++;
            } else {
                reapapge = 0;
                s++;
            }
            if (s > noofst) {
                return false;
            }
        }
        return true;
    }
}