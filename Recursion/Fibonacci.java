package Recursion;

public class Fibonacci {
    public static int calcFib(int i , int n , int fib){
        if(i==n){
            System.out.println(fib);
            return n;
        }
        int fib_np1 = calcFib(n+1,n,fib);
        int fib_n = n + fib_np1;
        return fib_n;
    }
    public static void main (String args []){
        int ans = calcFib(0,6,0);
        System.out.println(ans);
    }

}
