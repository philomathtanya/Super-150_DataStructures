public class Find_in_2d_Array {
    public static boolean searchMatrix(int[][] arr, int item) {
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==item)
                return true;
            else
            if(arr[row][col]>item)
                col--;
            else
                row++;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int item=13;
        System.out.println(searchMatrix(arr,item));
    }

}
