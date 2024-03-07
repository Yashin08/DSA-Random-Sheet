class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        int j = 1;
        Arrays.sort(arr);
        for(int i = 0; i<size; i++){
            if(i<size-1 && arr[i] == arr[i+1]){
                continue;
            }
            if(arr[i] > 0 && arr[i] == j){
                j++;
                continue;
            }
            else if(arr[i] > 0 && arr[i] != j){
                return j;
            }
            else if(i >= size){
                return arr[size-1]+1;
            }
        }
        return j;
    }
}
