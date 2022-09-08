import java.util.Scanner;

public class Inverse_of_an_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        int num=0;
        for (int i = 0; i < n; i++) {
            num=s.nextInt();
            arr[num]=i;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}
