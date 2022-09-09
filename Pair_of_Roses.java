import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int test=s.nextInt();
        for (int k = 0; k < test; k++) {
            int n=s.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=s.nextInt();
            }
            Arrays.sort(arr);
            int am=s.nextInt();
            int p1=0,p2=0;
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(arr[i]+arr[j]==am && i!=j) {
                        if(min>Math.abs(arr[i]-arr[j]))
                        {
                            min=Math.abs(arr[i]-arr[j]);
                            p1=arr[i];
                            p2=arr[j];
                        }
                    }
                }
            }
            System.out.println("Deepak should buy roses whose prices are "+p1+" and "+p2+".");
        }
    }
}
