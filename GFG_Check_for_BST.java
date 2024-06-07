class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root){
    return isBST(root,Long.MIN_VALUE,Long.MAX_VALUE);}
    boolean isBST(Node root,long minval,long maxval)
    {
        // code here.
        
        if(root==null){
            return true;
        }
        if(root.data>=maxval || root.data<=minval){
            return false;
        }
        return (isBST(root.left, minval, root.data) && isBST(root.right, root.data, maxval));
    }
}
