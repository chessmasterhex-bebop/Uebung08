package h2;

public class SimpleList {

    public Node head;

    public SimpleList() {
        head = new Node(Integer.MIN_VALUE);
    }

    public Node getFirst() {
        return head.next;
    }

    public Node getLast() {
        Node current = head.next;

        if (current == null) {
            return null;
        }

        while (current.next != null) {
            current = current.next;
        }

        return current;
    }

    public void append(int newValue) {
        Node newNode = new Node(newValue);

        Node last = getLast();
        if (last == null) {
            head.next = newNode;
        } else {
            last.next = newNode;
        }
    }

    public Node findFirst(int value) {
        Node current = head.next;

        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public boolean insertAfter(int preValue, int newValue) {
        Node current = head.next;

        while (current != null) {
            if (current.value == preValue) {
                Node newNode = new Node(newValue);
                newNode.next = current.next;
                current.next = newNode;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public boolean delete(int value) {
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.value == value) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }

        return false;
    }
}
