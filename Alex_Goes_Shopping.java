import java.util.Scanner;

public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i]=s.nextInt();
        }
        int q=s.nextInt();
        int que[]=new int[q];
        int que1[]=new int[q];
        for (int i = 0; i < q; i++) {
            que[i]=s.nextInt();
            que1[i]=s.nextInt();
        }
        int count=0;
        for (int i = 0; i < q; i++) {
            count=0;
            for (int j = 0; j <n ; j++) {
                if(que[i]>que1[j] && que[i]%arr[j]==0){
                    count++;
                }
            }
            if(count==que1[i]){
                System.out.println("Yes");
            }
            else
                System.out.println("No");
        }

    }
}
