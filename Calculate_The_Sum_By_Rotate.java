import java.util.Scanner;

public class Calculate_The_Sum_By_Rotate {
    public static void RotateArr(int n,int[] arr)
    {
        for (int j = 0; j < n; j++) {
            int len=arr.length;
        int temp=arr[len-1];
        for (int i = len-2; i >=0; i--) {
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
    }
//        print(arr);
    }
    public static void print(int[] arr){
        for (int n:arr) {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int t=s.nextInt();
        int test[]=new int[t];
        for (int i = 0; i < t; i++) {
            test[i]=s.nextInt();
        }
        int arr2[]=arr.clone();

        for (int p:test ) {
            RotateArr(p,arr);
            for (int i = 0; i < arr.length ; i++) {
                arr[i]+=arr2[i];
            }
            arr2=arr;
        }

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        System.out.println(sum % (int) (Math.pow(10,9)+7) );

    }
}
