class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); 

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(0); // Push a new score frame for the new '('
            } else {
                int innerScore = stack.pop(); // Pop the last score frame
                int topScore = stack.pop(); // Pop the previous score frame
                int newScore = topScore + Math.max(2 * innerScore, 1); // Calculate the new score
                stack.push(newScore); // Push the new score frame back
            }
        }

        return stack.pop();
    }
}
