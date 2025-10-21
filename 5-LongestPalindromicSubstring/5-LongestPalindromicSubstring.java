// Last updated: 10/21/2025, 5:32:21 PM
class Solution {
    public static boolean ispalindrome(char[] chars,int i,int j){
      while(i<j){  
        if(chars[i]!=chars[j]){
            return false;
        }
        i++;
        j--;
        
        }
        return true;

    }
    public String longestPalindrome(String s) {

        int maxleng=0;
        String longest ="";

        char[] chars=s.toCharArray();

        for(int i=0;i<chars.length;i++){
            for(int j=i;j<chars.length;j++){
                if(ispalindrome(chars,i,j)){
                    int len = j-i+1;
                    if(len>maxleng){
                        maxleng=len;
                        longest =s.substring(i,j+1);
                    }
                }
            }    
        }
        return longest;
    }
}