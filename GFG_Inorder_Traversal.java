class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> ar = new ArrayList<>();
        helper(root, ar);
        return ar;
    }
    
    static void helper(Node root, ArrayList<Integer> ar){
        if(root == null){
            return;
        }
        helper(root.left, ar);
        ar.add(root.data);
        helper(root.right, ar);
    }
}
