package Linkedlist;

public class ll {

    private Node head;
    private Node tail;
    private  int size;

    public ll(){
        this.size = 0;
    }

    public void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;

        }
        System.out.println("end");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public Node get(int index){
        Node temp  = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public int deleteLast(){
        Node NodeBeforeLast = get(size-2);
        int val = tail.value;
        tail = NodeBeforeLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleleFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int delete(int index){
        Node node = get(index-1);
        int val = node.next.value;
        node.next = node.next.next;
        return val;
    }

    public Node find(int val){
        Node temp = head;
        while(temp != null){
            if(temp.value == val){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
        Node(Node next){
            this.next = next;
        }
    }
}