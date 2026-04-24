import java.util.*;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Palindromic {
    public ListNode reverse(ListNode head){
        ListNode prevNode = null;
        ListNode currNode = head;

    while(currNode != null){
        ListNode next = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = next;
    }
    return prevNode;
    }
    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        while(hare.next != null || hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;

    }

    public boolean isPolindromic(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secondHalfStart = reverse(middle.next);
    
        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }public static void main(String[] args) {
    Palindromic sol = new Palindromic();

    // Build list: 1 -> 2 -> 3 -> 2 -> 1
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(2);
    head.next.next.next.next = new ListNode(1);

    System.out.println(sol.isPolindromic(head)); // true

    // Build list: 1 -> 2 -> 3
    ListNode head2 = new ListNode(1);
    head2.next = new ListNode(2);
    head2.next.next = new ListNode(3);

    System.out.println(sol.isPolindromic(head2)); // false
}
}

