package Recursion;

public class findc {
    public static boolean findC(String str,int idx){
        if(idx==str.length()){
            return false;
        }
        if(str.charAt(idx)=='c'){
            return true;
        }
        return findC(str,idx+1);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        System.out.println(findC(str,0));
    }
}
