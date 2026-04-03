package Recursion;

public class subset {
    public static void printSubset(String str, String ans, int idx){
        if(idx==str.length()){
            System.out.println(ans);
            return;
        }
        // to be
        printSubset(str, ans+str.charAt(idx), idx+1);
        // not to be
        printSubset(str, ans, idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubset(str,"",0);
    }
    
}
