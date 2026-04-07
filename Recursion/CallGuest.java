public class CallGuest {
    public static int callGuest (int n){
        if(n <=1){
            return 1;
        }
        // for 1st guest
        int ways1 = callGuest(n-1);

        // for 2nd guest
        int ways2 = (n-1) * callGuest(n-2);
        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 4;
        int totalWays = callGuest(n);
        System.out.println(totalWays);  
    }
}
