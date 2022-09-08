import java.util.Scanner;

public class Square_root {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(root(n));
    }
    public static int root(int n){
        int lo=1;int hi=n;
        int ans=0;
        while(lo<=hi)
        {
            int  mid=(lo+hi)/2;
            if(mid*mid<=n){
                ans=mid;
                lo=mid+1;
            }else {
                hi=mid-1;
            }
        }
        return ans;
    }
}
