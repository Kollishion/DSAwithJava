import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        //Creation
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //Will not be added as HashSet is built different 💪🏻

        //Size
        System.out.println("The size of set is:"+set.size());

        //.contains returns true if the set contains the element
        if(set.contains(1)){
            System.out.println("The set contains 1.");
        }
        if(!set.contains(5)){
            System.out.println("The set does not contains 5.");
        }

        //Loop Over HashSet
        //First element of HashSet will be null
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println(set);
        }
    }
}