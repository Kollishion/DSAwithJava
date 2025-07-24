//Problem 2: Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
import java.util.*;
public class LL_Asign2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the list followed by the elements of the list(Enter elements 1 to 50):");
        int n = in.nextInt();
        for(int i = 0; i<n; i++){
            list.add(in.nextInt());
        }
        System.out.println("Your given list:");
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.print("null");
        System.out.println();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int val = it.next();
            if (val >= 25) {
            it.remove();
        }
    }
        System.out.println("Modified list:");
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.print("null");
        System.out.println();
        in.close();
    }
}
