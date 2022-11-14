public class Power_logN_rand_Quick_Sort {
    public static void main(String[] args) {
        int a=3;
        int b=9;
    }
    public static int pos(int a,int b){
        if(b==0)
            return 1;
        int ans=pos(a,b/2);
        ans*=ans;
        return b%2==1 ? ans*a :ans;
    }
}
