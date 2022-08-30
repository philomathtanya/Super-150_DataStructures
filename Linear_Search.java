import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int p=s.nextInt();
        int [] arr=new int [p];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Search number: ");
        int n=s.nextInt();
        System.out.println("index:"+find(arr,n));

    }
    public static int find(int arr[],int n)
    {
        for (int i = 0; i < arr.length; i++) {
            if(n==arr[i])
            {
                return i+1;
            }

    }
        return -1;

}}
