import java.util.Scanner;

public class Divisible_Subarrays {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        while(test-- >0)
        {
            int n=s.nextInt();
            long arr[]=new long[n];
            long fre[]=new long[n];
            fre[0] = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            long sum=0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                int index = (int) (sum % n);
                if(index < 0){
                    index += n;
                }
                fre[index]++;
            }
            long ncr=0;
            for (int i = 0; i < n; i++) {
                if(fre[i]>=2){
                 long p=fre[i];
                 ncr += (p*(p-1))/2;
                }
            }
            System.out.println(ncr);
        }
    }
}
