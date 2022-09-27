import java.util.Scanner;
//print revrse of the number given

public class Print_Reverse_recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Number : ");
        int n=s.nextInt();
        reverse(n);
    }
    public static void reverse(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        reverse(n-1);
    }
}
