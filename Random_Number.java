import java.util.Random;

public class Random_Number {
    public static void main(String[] args) {
        //System.out.println(Math.random());//only generate the random number between 0 -> 1
        int lo=10;
        int hi=100;
        Random r=new Random();
        for (int i = 0; i < 40; i++) {
            int ran=r.nextInt(hi-lo+1)+lo;
            System.out.println(ran);
        }
    }
}
