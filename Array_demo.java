import java.util .*;

public class Array_demo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println(arr);
        System.out.println("Enter the size: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int[] arr2=arr;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
