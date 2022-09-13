import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sprial_2D_Array {
    public static void sprial(int arr[][]) {
        int minr = 0, maxr = arr.length - 1, minc = 0, maxc = arr[0].length - 1;
        int n=0,to=arr.length*arr[0].length;
while (n<to){
        for (int i = minc; i <= maxc && n<to; i++) {
            System.out.println(arr[minr][i] + "  ");
            n++;
        }
        minr++;
        for (int i = minr; i <=maxr && n<to; i++) {
            System.out.println(arr[i][maxc] + "  ");
         n++;
        }
        maxc--;
        for (int i = maxc; i >= minc && n<to; i--) {
            System.out.println(arr[maxr][i] + "  ");
        n++;
        }
        maxr--;
        for (int i = maxr; i >= minr && n<to; i--) {
            System.out.println(arr[i][minc] + "  ");
        n++;
        }
        minc++;
    }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=4;
        int m=4;
        int arr[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        sprial(arr);

    }
}

