//O(1) -> for inserting and O(n) in searching an element, Variable size and non-contiguous memory
public class LL{
    private int size;

    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    static Node head;
    //add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!= null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    } 
    //print
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }
    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("right?");
        list.addLast("NO!");
        list.printList();
        list.deleteFirst();
        System.out.println("");
        list.printList();
        list.deleteLast();
        System.out.println("");
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
    }
}