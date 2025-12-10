public class BST{
    public static void main(String[] args) {
        Binary_Tree ob = new Binary_Tree();
        ob.insert(8);
        ob.insert(7);
        ob.insert(12);
        ob.insert(15);
        ob.insert(2);
        ob.insert(5);
        ob.inorder();
        ob.search(5);
    }
}