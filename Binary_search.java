import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            int p=s.nextInt();
            int [] arr=new int [p];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=s.nextInt();
            }
            int item=s.nextInt();
            System.out.println(search(arr,item));
        }
        public static int search(int[]arr,int item){
        int si=0;
        int end=arr.length-1;
        while(si<=end){
            int mid=(si+end)/2;
            if(arr[mid]==item){
                return mid;
            }
            else if(arr[mid]>item){
                end=mid-1;
            }
            else{
            si=mid+1;
            }
        }
        return -1;
        }
}
