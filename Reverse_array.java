import java.util.Scanner;

public class Reverse_array {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int p = s.nextInt();
            int[] arr = new int[p];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }

            reverse(arr);

        }

        public static void reverse(int arr[]) {
int i=0;
int j=arr.length-1;
            while(i!=arr.length/2) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;

                }
            print(arr);

            }


        public static void print(int arr[])
        {
            for (int i = 0; i <arr.length ; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }

