public class LL_Reverse{
    private int size;

    LL_Reverse(){
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
    Node head;
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
    public void addInMiddle(int index, String data){
        if(index > size || index < 0){
            System.out.println("invalid index");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if(head == null || index == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for(int i = 1; i<size; i++){
            if(i == index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
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
    public void revList(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
        LL_Reverse list = new LL_Reverse();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();
        System.out.println();
        System.out.println("The reverse list is:");
        list.revList();
        list.printList();
    }
}