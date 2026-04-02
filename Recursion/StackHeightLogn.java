package Recursion;

public class StackHeightLogn {
 
    public static int calcLog (int x, int n){
        if(x==0){  // base case 1 
            return 0;
        }
        if(n==0){  // base case 2
            return 1;
        }
        if(n%2==0){ // even
            return calcLog(x, n/2) * calcLog(x, n/2);
        }
        else{ // odd
            return calcLog(x, n/2) * calcLog(x, n/2) * 2;
        }
    }
    public static void main (String args[]){
        int x = 2, n = 6;
        int ans = calcLog(x, n);
        System.out.println(ans);
    }
}
