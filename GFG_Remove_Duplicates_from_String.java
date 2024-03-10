class Solution 
{
    String removeDuplicates(String str) 
    {
        
        String result ="";
        HashSet characterSet = new HashSet();
        for(int i=0;i<str.length();i++)
        {
            if(!characterSet.contains(str.charAt(i)))
            {
                result += str.charAt(i);
                characterSet.add(str.charAt(i));
            }
        }
        return result;
    }
}
