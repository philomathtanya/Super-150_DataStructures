import java.util.Scanner;

public class Maximum_Circular_Sum {
        public static void main(String args[]) {
            int test;
            Scanner s=new Scanner(System.in);
            test =s.nextInt();

            while(test >0)

            {
                int n;
                n=s.nextInt();
                int arr[]=new int[n];

                for(int i=0;i<n;i++)
                {
                    arr[i]=s.nextInt();
                }
                int p= Max_Sub_Array(arr);
                int f=0;
                for(int i=0;i<arr.length;i++)
                {
                    f+=arr[i];
                    arr[i]=arr[i]*(-1);
                }
                int q= Max_Sub_Array(arr);
                int o=f+q;
                System.out.println(Math.max(p,o));
                test--;}}

        public static int Max_Sub_Array(int arr[])
        {
            int Current =0;
            int maximum =0;
            for(int i=0;i<arr.length;i++)
            {
                Current +=arr[i];
                if(Current > maximum)
                {
                    maximum = Current;
                }
                if(Current <0)
                {
                    Current =0;
                }
            }
            return maximum;
        }
    }