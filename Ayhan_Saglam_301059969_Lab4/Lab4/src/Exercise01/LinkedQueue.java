package Exercise01;
//LinkedQue class implemented Queue Interface.

public class LinkedQueue<E>implements Queue<E> {

    // Created new singly linked list object to use its methods.
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    //Zero argument constructor
    public LinkedQueue() {}

  //Following overrides Queue interfaces methods
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    //Print LinkedQue list
    public String toString(){
        return list.toString();
    }
    // Concatenate method
    public void concatenate(LinkedQueue<E> Q2) {// take an linkedqueue argumet
        if (isEmpty()) {//check if linked queue list empty
            this.list.tail = Q2.list.head;
            this.list.head = this.list.tail;
        } else {// if it is not empty
            this.list.tail.setNext(Q2.list.head); //this list=(1,2,3)  q2.list=(1,2,3,4,5)
        }
        this.list.size += Q2.size();//this list=(1,2,3) it's tail,  after set next method add q2.list=(1,2,3,4,5)
        Q2.list = new SinglyLinkedList<>(); // create ne singly linked list and assign to q2.list.
    }
    public static void main(String[] args) {




        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        LinkedQueue<Integer> queue2 = new LinkedQueue<>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);
        queue2.concatenate(queue);// queue2 linked que list concatenate queue
        System.out.println(queue2.toString());




    }
}
