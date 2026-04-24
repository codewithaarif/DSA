

class RemoveNthFromLast {


    public ListNode RemoveNthNodeFromLast(ListNode head, int n){
        if(head.next == null || head.next == null){
            return null;
        }
        int size = 0;
        ListNode currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }

        if(n==size){
            return head.next;
        }
        int indexToSearch = size - n;
        ListNode prevNode = head;
        int i = 1;
        while(i<indexToSearch){
            prevNode = prevNode.next;
            i++;
        }

            prevNode.next = prevNode.next.next;
            return head;
    }
    public static void main(String[] args) {
        RemoveNthNodeFromLast("head" , 2);

        System.out.println();
    }
    
}
