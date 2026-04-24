import java.util.*;

public class JCF {
    public static void pushAtBottom(Stack<Integer> list , int data ){
        if(list.isEmpty()){
            list.push(data);
            return;
        }
        int top = list.pop();
        pushAtBottom(list, data);
        list.push(top);
    }
    public static void reverse(Stack<Integer> list){
        if(list.isEmpty()){
            return;
        }
        int top = list.pop();
        reverse(list);
        pushAtBottom(list, top);
    }
    public static void main (String [] args){
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);  
        list.push(3);

      

        reverse(list);

    
     while(!list.isEmpty()){
            System.out.println(list.peek());
          list.pop();
        }
    }
}