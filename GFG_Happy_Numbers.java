class Solution { 
  
    static int isHappy(int N) { 
        int slow = N;
        int fast = N;
        
        do{
            slow = fsquare(slow);
            fast = fsquare(fsquare(fast));
        }while(slow != fast);
        
        if(slow == 1){
            return 1;
        }
        return 0;
    }
    
    static int fsquare(int num){
        int result = 0;
        while(num > 0){
            int rem = num % 10;
            result += rem * rem;
            num /= 10;
        }
        return result;
    }
}
