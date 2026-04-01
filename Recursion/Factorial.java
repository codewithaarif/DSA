package Recursion;
import java.util.*;
public class Factorial{
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
       int fact_nm1 = printFact(n-1);
       int fact = n * fact_nm1;
       return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int ans = printFact(num);
        System.out.println(ans);
        sc.close();
    }
}