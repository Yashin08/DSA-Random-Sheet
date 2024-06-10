class Tree
{
    //Function to return list containing elements of left view of binary tree.
    void traverse(ArrayList<Integer> arr,int level, Node n)
    {
        if(n==null)
            return;
        if(arr.size()==level)
        {
            arr.add(n.data);
        }
        traverse(arr,level+1,n.left);
        traverse(arr,level+1,n.right);
            
        
    }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      
      ArrayList<Integer> arr= new ArrayList<Integer>();
      traverse(arr,0,root);
      return arr;
    }
}
