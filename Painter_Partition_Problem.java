
import java.util.*;

public class Painter_Partition_Problem
{

    static int Sum_total(int array[], int from, int to)
    {
        int Total = 0;
        for (int i = from; i <= to; i++)
            Total += array[i];
        return Total;
    }


    static int partition(int arr[], int n, int k)
    {
        if (k == 1)
            return Sum_total(arr, 0, n - 1);
        if (n == 1)
            return arr[0];
        int best = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++)
            best = Math.min(best, Math.max(partition(arr, i, k - 1),
                    Sum_total(arr, i, n - 1)));
        return best;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        int k =s.nextInt();
        int n =s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(partition(arr, n, k));
    }
}
