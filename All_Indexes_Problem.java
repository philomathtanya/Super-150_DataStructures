import java.util.Scanner;

public class All_Indexes_Problem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int item=s.nextInt();
        find(arr,item,0);
    }
    public static void find(int arr[],int item,int index){
        if(index> arr.length-1)
            return;
        if(arr[index]==item){
            System.out.print(index+" ");
        }
        find(arr,item,++index);
    }
}
