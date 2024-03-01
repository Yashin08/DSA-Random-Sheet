

//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        //fib(0) = 0;
        //fib(1) = 1;
        //fib(n) = fib(n-1)+fib(n-2);
        int a = 0, b = 1, c=0;
        if(n<=1){
            return n;
        }
        for(int i = 2; i<=n; i++){
            c = a+b;
            a = b;
            b=c%1000000007;
        }
        return b;
    }
}
