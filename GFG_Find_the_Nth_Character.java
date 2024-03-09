class Solution
{
    public char nthCharacter(String s, int r, int n)
    {


        while(r!=0){
            String newstring="";

//here we writing empty string
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==('0')){
                    newstring+="01";
                }
                if(s.charAt(i)==('1')){
                    newstring+="10";
                }
                 if(newstring.length()>s.length())
                    break;
            }
            s=newstring;
            r--;
        }
        
        return s.charAt(n);
    }
}
