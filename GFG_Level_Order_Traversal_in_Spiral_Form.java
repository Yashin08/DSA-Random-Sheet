class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        ArrayList<Integer> ar = new ArrayList<>();
        
        if(root == null){
            return ar;
        }
        
        st1.add(root);
        
        while(!st2.isEmpty() || !st1.isEmpty()){
            while(!st1.isEmpty()){
                Node temp = st1.pop();
                ar.add(temp.data);
                if(temp.right!=null) st2.push(temp.right);
                if(temp.left!= null) st2.push(temp.left);
                
            }
            while(!st2.isEmpty()){
                Node temp = st2.pop();
                ar.add(temp.data);
                if(temp.left!=null) st1.add(temp.left);
                if(temp.right!= null) st1.add(temp.right);
                
            }
        }
        
        return ar;
    }
}
