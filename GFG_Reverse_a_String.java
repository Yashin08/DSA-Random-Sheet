class Reverse {
    // Complete the function
    // str: input string
    public static String reverseWord(String str) {
        StringBuilder reversed = new StringBuilder(str);

        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - 1 - i;
            char frontchar = str.charAt(front);
            char backchar = str.charAt(back);
            reversed.setCharAt(front, backchar);
            reversed.setCharAt(back, frontchar);
        }
        
        return reversed.toString();
    }
}
