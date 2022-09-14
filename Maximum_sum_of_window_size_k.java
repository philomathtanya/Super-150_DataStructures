//Sliding window technique...used here
public class Maximum_sum_of_window_size_k {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,6,7,1,8,9,11,5,7};
        int k=3;
        System.out.println(SlidingMax(arr,k));
    }
    public static int  SlidingMax(int arr[],int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int ans=sum;
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i];
            sum-=arr[i-k];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
