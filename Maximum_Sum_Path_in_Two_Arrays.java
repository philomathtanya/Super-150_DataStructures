import java.util.*;
import java.lang.Math;
public class Maximum_Sum_Path_in_Two_Arrays {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int k = 0; k < n; k++) {


            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int arr[] = new int[n1];
            int arr1[] = new int[n2];

            for (int i = 0; i < n1; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < n2; i++) {
                arr1[i] = s.nextInt();
            }
            int sum1 = 0, sum2 = 0, tsum = 0;
            int i=0,j=0;
            while(i<arr.length && j<arr1.length){
                    if (arr[i] < arr1[j]) {
                        sum1 += arr[i];
                        i++;

                    } else if (arr[i] > arr1[j]) {
                        sum2 += arr1[j];
                        j++;
                    } else if (arr[i] == arr1[j]) {
                        tsum += arr[i];
                        tsum += Math.max(sum1, sum2);
                        sum1 = 0;
                        sum2 = 0;
                        i++;
                        j++;
                    }
            }
        while(i<arr.length)
        {
            sum1+=arr[i];
            i++;
        }
            while(j<arr1.length)
            {
                sum2+=arr1[j];
                j++;
            }
            tsum+=Math.max(sum1,sum2);

            System.out.println(tsum);


        }

    }
}