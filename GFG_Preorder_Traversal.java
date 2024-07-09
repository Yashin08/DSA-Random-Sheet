class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> ar = new ArrayList<>();
        helper(root, ar);
        return ar;
    }
    public static void helper(Node root, ArrayList<Integer> ar){
        if(root == null){
            return;
        }
        
        ar.add(root.data);
        helper(root.left, ar);
        helper(root.right, ar);
    }
}
