import java.util.Scanner;

public class First_index_Array_recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=s.nextInt();
        }
        int item=s.nextInt();
        System.out.println("INDEX : "+find(arr,item,0));
    }
    public static int find(int arr[],int item,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==item){
            return index;
        }


        return find(arr,item,++index);
    }
}
