
class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String S) {
        String[] str = S.split("\\."); // Escape dot, as it is special element
        StringBuilder result = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            result.append(str[i]);
            if (i != 0) {
                result.append(".");
            }
        }
        return result.toString(); //Stringbuilder should be converted to string before returning
    }
}
