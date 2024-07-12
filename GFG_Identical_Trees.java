class Solution
{
    //Function to check if two trees are identical.
    boolean isIdentical(Node root1, Node root2)
    {
        // If both trees are empty, they are identical
        if (root1 == null && root2 == null) {
            return true;
        }
        
        // If one of the trees is empty, they are not identical
        if (root1 == null || root2 == null) {
            return false;
        }
        
        // Check if the data of both nodes is equal and 
        // recursively check the left and right subtrees
        return (root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }
}
