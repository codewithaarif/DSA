import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // add element
        list.add(1);
        list.add(2);
        System.out.println(list);

        // get elment
        int element = list.get(0);
        System.out.println(element);


        // add element in between
        list.add(2,3);
        System.out.println(list);


        // set element
        list.set(2,0);
        System.out.println(list);

        // delete element 
        list.remove(2);
        System.out.println(list); 
        
        // list size
        int size = list.size();
        System.out.println(size);

        // loops
        for(int i = 0; i <list.size();i++){
            System.out.print(list.get(i));
        } System.out.println();

        // Sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
