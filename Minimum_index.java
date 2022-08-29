import java.util.Scanner;

public class Minimum_index {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(index(arr));
    }
    public static int index(int arr[])
    { int min=arr[0];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}
