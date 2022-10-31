import java.util.*;
class Mazepath_D{
	public static void pri(int r, int c,int n,int m,String anss){
        if(r==n-1 && c==m-1){
            System.out.print(anss+" ");
            anss="";
            r=0;
            c=0;
            count++;
            return;
        }
        if(r<n-1){
            pri(r+1,c,n,m,anss+"V" );
        }
        if(c<m-1){
            pri(r,c+1,n,m,anss+"H");
        }
        if(c<m-1 && c<n-1){
            pri(r+1,c+1,n,m,anss+"D");
        }
    }
	public static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        pri(0,0,r,c,"");
        System.out.println();
        System.out.println(count);
        count=0;
    }
}