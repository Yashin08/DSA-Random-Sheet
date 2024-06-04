class Solution
{
   
    String reverseWords(String S)
    {
        // your code here
        Stack<Character> stack = new Stack<>();
       StringBuffer ans = new StringBuffer();
       for(int i =0;i<S.length();i++){
           char ch = S.charAt(i);
           
           if(ch!='.'){
               stack.push(ch);
           }
           else{
               while(!stack.isEmpty()){
                   ans.append(stack.peek());
                   stack.pop();
               }
               ans.append(".");
           }
       }
       
       while(!stack.isEmpty()){
           ans.append(stack.pop());
       }
       
       return ans.toString();
    }
}
