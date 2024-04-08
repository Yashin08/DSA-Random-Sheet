class Solution
{
   
    public static boolean isRotated(String str1, String str2)
    {
        if(str1.length() != str2.length()){
            return false;
        }
        
        if(str1.length() < 2) {
            return str1.equals(str2); // If length is less than 2, both strings should be equal
        }
        
        // Check rotation by 2 places to the right
        String clockwiseRotated = str2.substring(str2.length() - 2) + str2.substring(0, str2.length() - 2);
        if(str1.equals(clockwiseRotated)){
            return true;
        }
        
        // Check rotation by 2 places to the left
        String anticlockwiseRotated = str2.substring(2) + str2.substring(0, 2);
        if(str1.equals(anticlockwiseRotated)){
            return true;
        }
        
        return false;
    }
}
