import java.util.ArrayList;
import java.util.Collections;

public class ArrayList {
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        // add element
        list.add(0);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get element
       int element = list.get(1);
       System.out.println(element);

       // add element in between  
       list.add(1,7);
       System.out.println(list);

       // set element
       list.set(0,19);
       System.out.println(list);

       // remove element
       list.remove(0);
       System.out.println(list);

       int size = list.size();
       System.out.println(size);

       // loop
       for(int i = 0; i < list.size();i++){
        System.out.print(list.get(i) + " ");
       } 
       System.out.println();
    
       // sort
       Collections.sort(list);
       System.out.println(list);
    }
}