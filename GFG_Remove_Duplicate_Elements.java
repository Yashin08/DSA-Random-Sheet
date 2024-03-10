class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int count=1;
        
        for(int i=1;i<N;i++){
            if(A[i]!=A[i-1]){
                A[count]=A[i];
                count++;
            }
        }
        return count;
    }
}
