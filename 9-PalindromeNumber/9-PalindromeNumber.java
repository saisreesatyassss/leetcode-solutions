// Last updated: 10/23/2025, 5:26:16 PM
class Solution {
    public boolean isPalindrome(int x) {
        
        String str = String.valueOf(x);
        String res="";

        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }

    return res.equals(str);
    }
}