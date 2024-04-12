public class Solution {
    public static String oddEven(int N){
        int a = N&1;
        if(a==1){
            return "odd";
        }
        else{
            return "even";
        }
    }
}
