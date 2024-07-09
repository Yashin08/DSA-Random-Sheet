class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
        ArrayList<Integer> arr = new ArrayList<Integer>();
        helper(node, arr);
        return arr;
    }
    
    static void helper(Node node, ArrayList<Integer> arr){
        if(node == null){
            return;
        }
        helper(node.left, arr);
        helper(node.right, arr);
        arr.add(node.data);
    }
}
