import java.util.Scanner;

public class Swap_Array {
    public static void main(String[] args) {
        int arr[]={5,3,4,6,8,2,1,5};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr,0,1);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
