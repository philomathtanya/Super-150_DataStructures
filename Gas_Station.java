public class Gas_Station {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int curr=0;
        int si=0;
        for (int i = 0; i < cost.length; i++) {//-2,-2,-2=-6,-3,0
            total=total+(gas[i]-cost[i]);//0
            curr=curr+(gas[i]-cost[i]);//3
            if(curr<0){
                curr=0;
                si=i+1;//3

            }}
        if(total<0)
            return -1;
        return si;
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
