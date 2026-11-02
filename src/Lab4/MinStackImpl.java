

// НЕ ДЕЛАЙТЕ это всё в одном файле 🙏🙏🙏

public class MinStackImpl implements MinStack<Integer> {
    private static class Node {
        Integer value;
        Node next;
        Integer min;
    }
    private Node head;

    @Override
    public void push(Integer value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head == null) {
            newNode.min = value;
        } else {
            newNode.min = Math.min(value, head.min);
        }
        newNode.next = head;
        head = newNode;
    }

    @Override
    public Integer pop() {
        if (head == null) {return null ;}
        Integer poppedValue = head.value;
        head = head.next;
        return poppedValue;
    }

    @Override
    public Integer top() {
        if (head == null) { return null;}
        return head.value;
    }

    @Override
    public Integer min() {
        if (head == null) { return null;}
        return head.min;
    }
}
