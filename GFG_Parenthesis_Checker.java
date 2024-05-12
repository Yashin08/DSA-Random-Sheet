class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        
        for(char ch : x.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            
            if(ch == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
            if(ch == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
            if(ch == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
