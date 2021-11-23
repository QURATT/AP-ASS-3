class BST_class { 
    //node class that defines BST node
    class Node { 
        String key; 
        Node left_child, right_child; 
   
        public Node(String data){ 
            key = data; 
            left_child = right_child = null; 
        } 
    } 
    // BST root node 
    Node root; 
  
   // Constructor for BST =>initial empty tree
    BST_class(){ 
        root = null; 
    } 
  
   
    // insert a node in BST 
    void insert(String key)  { 
        root = insert_Recursive(root, key); 
    } 
   
    //recursive insert function
    Node insert_Recursive(Node root, String key) { 
          //tree is empty
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        //traverse the tree
        if (key.compareTo(root.key)<0)     //insert in the left_child subtree
            root.left_child = insert_Recursive(root.left_child, key); 
        else if (key.compareTo(root.key)>0)    //insert in the right_child subtree
            root.right_child = insert_Recursive(root.right_child, key); 
          // return pointer
        return root; 
    } 
 
// method for inorder traversal of BST 
    void inorder() { 
        inorder_Recursive(root); 
    } 
   
    // recursively traverse the BST  
    void inorder_Recursive(Node root) { 
        if (root != null) { 
            inorder_Recursive(root.left_child); 
            System.out.print(root.key + "\n"); 
            inorder_Recursive(root.right_child); 
        } 
    } 
     
    boolean search(String key)  { 
        Node Root = search_Recursive(root, key); 
        if (Root!= null)
            return true;
        else
            return false;
    } 
   
    //recursive insert function
    Node search_Recursive(Node root, String key)  { 
        // Base Cases: root is null or key is present at root 
        if (root==null)  
            return root;
        if (root!=null && (key.compareTo(root.key))==0)  
            return root;  
        // val is greater than root's key 
        if (key.compareTo(root.key)<0) 
            return search_Recursive(root.left_child, key); 
        // val is less than root's key 
        return search_Recursive(root.right_child, key); 
    } 
}

 