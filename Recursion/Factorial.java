package Recursion;
import java.util.*;
public class Factorial{
    public static int printFact(int n){
        if(n==0){
            return 1;
        }
       int factNm1 = printFact(n-1);
       int fact = n * factNm1;
       return fact;
    }
    public static void main(String args[]){
        
        int ans = printFact(6);
        System.out.println(ans);

    }
}