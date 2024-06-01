class Solution{
    static int maxLength(String S){
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        stack.push(-1);
        for(int i = 0; i< S.length(); i++){
            if(S.charAt(i) == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    count = Math.max(count, i-stack.peek());
                }
            }
        }
        return count;
    }
}
