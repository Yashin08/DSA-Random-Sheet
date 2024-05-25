class Solution {
    public String FirstNonRepeating(String A) {
        StringBuilder result = new StringBuilder();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < A.length(); i++) {
            char currentChar = A.charAt(i);

            // Update the count in the map
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

           
            result.append(getFirstNonRepeating(map));
        }

        return result.toString();
    }

    private char getFirstNonRepeating(LinkedHashMap<Character, Integer> map) {
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return '#';
    }
}
