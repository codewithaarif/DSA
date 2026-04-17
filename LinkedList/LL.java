class LL {
    private Node head;
    private int size;

    private class Node {
        private final String data;
        private Node next;

        private Node(String data) {
            this.data = data;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;
    }

    public boolean insertAt(int index, String data) {
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size) {
            addLast(data);
            return true;
        }

        Node previous = getNode(index - 1);
        Node newNode = new Node(data);
        newNode.next = previous.next;
        previous.next = newNode;
        size++;
        return true;
    }

    public String deleteFirst() {
        if (head == null) {
            return null;
        }

        String removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public String deleteLast() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return deleteFirst();
        }

        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        String removedData = secondLast.next.data;
        secondLast.next = null;
        size--;
        return removedData;
    }

    public boolean deleteValue(String data) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(data)) {
            deleteFirst();
            return true;
        }

        Node current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next == null) {
            return false;
        }

        current.next = current.next.next;
        size--;
        return true;
    }

    public boolean contains(String data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void reverse() {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String peekFirst() {
        return head == null ? null : head.data;
    }

    public String peekLast() {
        if (head == null) {
            return null;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public String display() {
        if (head == null) {
            return "empty";
        }

        StringBuilder builder = new StringBuilder();
        Node current = head;
        while (current != null) {
            builder.append(current.data).append(" -> ");
            current = current.next;
        }
        builder.append("null");
        return builder.toString();
    }

    public void printList() {
        System.out.println(display());
    }

    private Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
}
