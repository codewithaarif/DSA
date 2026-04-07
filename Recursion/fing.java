package Recursion;

public class fing {
    public static int findA(String str,int idx){
        if(idx==str.length()){
            return -1;
        }
        if(str.charAt(idx)=='a'){
            return idx;
        }
        return findA(str,idx+1);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        System.out.println(findA(str,0));
    }
}
