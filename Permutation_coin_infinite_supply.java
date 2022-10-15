public class Permutation_coin_infinite_supply {
    public static void main(String[] args) {
        int []coin={2,3,5,7};
        int amount=10;
        printans(coin,amount,"");
    }
    public static void printans(int [] coin,int amount,String ans){
        if(amount==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(amount>=coin[i]){
                printans(coin,amount-coin[i],ans+coin[i]);
//                amount-=coin[i];
//                printans(coin,amount,ans+coin[i]);
//                amount+=coin[i];// backtraking statement
            }

        }
    }
}
