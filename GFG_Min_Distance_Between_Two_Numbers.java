class Solution {
    int minDist(int a[], int n, int x, int y) {
       int minDistance = Integer.MAX_VALUE;
       int lastIndexX = -1;
       int lastIndexY = -1;
       for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                if (lastIndexY != -1) {
                    minDistance = Math.min(minDistance, i - lastIndexY);
                }
                lastIndexX = i;
            } else if (a[i] == y) {
                if (lastIndexX != -1) {
                    minDistance = Math.min(minDistance, i - lastIndexX);
                }
                lastIndexY = i;
            }
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }
}
