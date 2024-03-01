// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i<n+1; i++){   // Calculating the total sum in the range 1 to n
            sum1 += i;
        }

        for(int j = 0; j<=array.length-1; j++){  // Calculating the sum of digits provided in array
            sum2 += array[j];
        }
        return sum1-sum2;  //subtracting the sum to get the final Missing Number
    }
}
