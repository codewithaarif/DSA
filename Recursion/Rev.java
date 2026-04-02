package Recursion;

public class Rev {
    public static void printRev(int idx, String str ){
        if(idx==0){
        System.out.println(str.charAt(idx));
        return;
        }
        System.out.print(str.charAt(idx));
        printRev(idx-1, str);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str.length()-1,str);
    }
}
