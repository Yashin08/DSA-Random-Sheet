class Solution {
    // Function to convert an infix expression to a postfix expression.
    
    static int precedence(char a){
        if(a == '^'){
            return 3;
        } else if(a == '*' || a == '/'){
            return 2;
        } else if(a == '+' || a == '-'){
            return 1;
        }
        return 0;
    }
    
    public static String infixToPostfix(String exp) {
        StringBuilder str = new StringBuilder();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            
            // Check if the character is a letter or digit
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                str.append(ch);
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    str.append(st.pop());
                }
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
            }
            else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(ch)) {
                    str.append(st.pop());
                }
                st.push(ch);
            }
        }
        
        // Pop all the operators from the stack
        while (!st.isEmpty()) {
            str.append(st.pop());
        }
        
        return str.toString();
    }
}
