class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        ArrayList<Integer> alst = new ArrayList<Integer>();
        boolean[] prime = new boolean[N+1];
        for(int i = 2; i*i <= N; i++){
            if(!prime[i]){
                for(int j = i*2; j<=N; j+=i){
                    prime[j] = true;
                }
            }
        }
        for(int i = 2; i<=N; i++){
            if(!prime[i]){
                alst.add(i);
            }
        }
        return alst;
    }
}
