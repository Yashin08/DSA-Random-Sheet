class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];

        // Mark elements as negative to indicate presence
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] > 0) {
                arr[index] = -arr[index];
            } else {
                result[0] = Math.abs(arr[i]); // Repeated element
            }
        }

        // Find the missing element
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1; // Missing element
                break;
            }
        }

        return result;
    }
}
