class Solution {
    int getPairsCount(int[] arr, int n, int k) {
        int count = 0;

        // Create a HashMap to store the frequency of each element in the array
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Traverse the array and update the frequency map
        for (int i = 0; i < n; i++) {
            if (freqMap.containsKey(k - arr[i])) {
                count += freqMap.get(k - arr[i]);
            }

            // Update the frequency map for the current element
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        return count;
    }
}
