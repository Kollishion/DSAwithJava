public class Binary_Tree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    Node root;
    public void insert(int data) {
        root = insertRec(root, data);
    }
    public Node insertRec(Node root, int data){
                if(root == null)
                    root = new Node(data);
                else if(data < root.data){
                    root.left = insertRec(root.left, data);
                }else{
                    root.right = insertRec(root.right, data);
                }

            return root;
    }
    public void inorder(){
        inorderRec(root);
    }
    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data+","+" ");
            inorderRec(root.right);
        }
    }
    public void search(int data){
        Node result = searchRec(root, data);
        System.out.println(result == null ? "Not found" : result.data);
    }
    public Node searchRec(Node root, int data){
        if(root == null){
            return null;
        }else if(root.data < data){
            return searchRec(root.right, data);
        }else if(root.data > data){
            return searchRec(root.left, data);
        }else{
            return root;
        }
    }
}
