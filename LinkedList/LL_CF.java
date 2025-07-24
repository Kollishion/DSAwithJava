import java.util.*;
//LL_CF = Linked List using Collection Framework 
public class LL_CF {
    public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("a");
    list.addFirst("is");
    list.addLast("right?");
    System.out.println(list);
    list.addLast("NO!");
    System.out.println(list);
    System.out.println(list.size());
    for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        list.addFirst("is");
        list.addLast("NO?");
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.print("null");
    }
}
