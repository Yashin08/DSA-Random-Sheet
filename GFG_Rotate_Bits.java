class Solution
{
    
    ArrayList<Integer> rotate(int n, int d)
    {
        // your code here
        int a,b;
        d=d%16;
        a=(n<<d | n>>(16-d)) & 0xFFFF;
        b= (n>>d | n<<(16-d)) & 0xFFFF;
        ArrayList<Integer> ans= new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
