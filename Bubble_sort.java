import java.util.*;
public class Bubble_sort {

    public static void main (String args[]) {
            Scanner s=new Scanner(System.in);
            int p=s.nextInt();
            int [] arr=new int [p];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=s.nextInt();
            }
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }


            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }

        }
    }

