import java.util.*;
class Subset_problem_Recursion{
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        int t=s.nextInt();
        t=print(arr,"",t,0,0);
        System.out.println();
        System.out.println(t);
    }
    public static int print(int[] arr, String a, int t, int i, int sum){
        if(i==arr.length) {
            if (sum == t) {
                System.out.print(a + " ");
                return 1;
            }
            return 0;
        }
        return print(arr,a+arr[i]+" ",t,i+1,sum+arr[i]) + print(arr,a,t,i+1,sum);
    }
}
