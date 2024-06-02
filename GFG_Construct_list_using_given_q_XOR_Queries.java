class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0); // Initial list contains only 0
        int cumulativeXor = 0; // Track cumulative XOR value
        
        for (int[] query : queries) {
            if (query[0] == 0) {
                // Insert x in the list, applying cumulative XOR
                result.add(query[1] ^ cumulativeXor);
            } else if (query[0] == 1) {
                // Update cumulative XOR
                cumulativeXor ^= query[1];
            }
        }
        
        // Apply the final cumulative XOR to all elements
        for (int i = 0; i < result.size(); i++) {
            result.set(i, result.get(i) ^ cumulativeXor);
        }
        
        // Sort the list
        Collections.sort(result);
        return result;
    }
}
