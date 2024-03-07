class GFG 
{
    ArrayList<Integer> find(int arr[], int n, int x) {
        int first_occ = -1, last_occ = -1;
        int low = 0, high = n - 1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        // Finding the first occurrence
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                first_occ = mid;
                high = mid - 1; // Continue searching in the left half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Finding the last occurrence
        low = 0;
        high = n - 1; // Reset low and high
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                last_occ = mid;
                low = mid + 1; // Continue searching in the right half
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (first_occ == -1 || last_occ == -1) {
            result.add(-1);
            result.add(-1);
        } else {
            result.add(first_occ);
            result.add(last_occ);
        }
        return result;
    }
}
