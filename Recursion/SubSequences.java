public class SubSequences {
    public static void subSequences(String str , int idx , String newString) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be 
        subSequences(str, idx+1, newString+currChar);
        // or not to be
        subSequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "aaa";
        subSequences(str, 0, "");
    }
}
