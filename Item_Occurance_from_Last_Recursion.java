public class Item_Occurance_from_Last_Recursion {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,3,8,9};
        int item=11;
        int i= arr.length-1;
        System.out.println("INDEX : "+find(arr,item,i));
    }
    public static int find(int arr[],int item,int index){
        if(index<0){
            return -1;
        }
        if(arr[index]==item){
            return index;
        }

        return find(arr,item,--index);
    }
}
