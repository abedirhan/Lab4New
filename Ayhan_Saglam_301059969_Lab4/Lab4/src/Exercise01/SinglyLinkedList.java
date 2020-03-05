package Exercise01;

public class SinglyLinkedList<T> implements Cloneable {
    public Node<T> head = null;
    public Node<T> tail = null;
    public int size = 0;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    // R-3.9
    public int sizeReimplementation() {
        int counter = 0;
        Node<T> node = head;
        while (node != null) {
            node = node.getNext();
            counter++;
        }
        return counter;
    }

    public void addFirst(T value) {
        this.head = new Node(value, head);
        if (isEmpty()) {
            tail = head;
        }
        size++;
    }

    public void addLast(T value) {
        Node newNode = new Node(value, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
        size++;
    }

    public T first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public T last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public T secondToLast() {
        if (size() < 2) {
            return null;
        }
        Node<T> cur = head;
        while (cur.getNext().getNext() != null) {
            cur = cur.getNext();
        }
        return cur.getElement();
    }

    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T element = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }

    public class Node<T> {
        Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }

        private T value;
        private Node<T> next;

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public Node<T> getNext() {
            return this.next;
        }

        public T getElement() {
            return value;
        }
    }

    public boolean equals(Object o) {
        if (o == null || size() != ((SinglyLinkedList) o).size() || getClass() != o.getClass()) {
            return false;
        }
        Node n1 = head;
        Node n2 = ((SinglyLinkedList) o).head;
        while (n1 != null) {
            if (!n1.getElement().equals(n2.getElement())) {
                return false;
            }
            n1 = n1.getNext();
            n2 = n2.getNext();
        }
        return true;
    }

    public SinglyLinkedList<T> clone() throws CloneNotSupportedException {
        SinglyLinkedList<T> newList = (SinglyLinkedList<T>) super.clone();
        if (!isEmpty()) {
            Node<T> node = new Node<T>(head.getElement(), null);
            newList.head = node;
            Node<T> walker = head.getNext();
            Node<T> cur = node;
            while (walker != null) {
                node = new Node<T>(walker.getElement(), null);
                cur.setNext(node);
                cur = node;
                walker = walker.getNext();
            }
            newList.tail = cur;
        }
        return newList;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        Node<T> walk = head;
        while (walk != null) {
            sb.append(walk.getElement());
            if (walk != tail)
                sb.append(", ");
            walk = walk.getNext();
        }
        sb.append(")");
        return sb.toString();
    }

    public void rotate() {
        if (isEmpty()) {
            return;
        }
        tail.setNext(head);
        tail = head;
        head = head.getNext();
        tail.setNext(null);
    }

    public static void main(String[] args) throws CloneNotSupportedException {


    }
}