class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> result = new ArrayList<>();
        result.add(n);
        while(n!=1){
            n=(n%2==0)?(long)Math.pow(n,1.0/2.0):(long)Math.pow(n,3.0/2.0);
            result.add(n);
        }
        return result;
    }
}
