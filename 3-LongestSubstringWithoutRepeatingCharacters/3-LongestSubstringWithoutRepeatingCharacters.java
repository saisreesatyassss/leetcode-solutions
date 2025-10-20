// Last updated: 10/20/2025, 3:58:15 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int length=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);
            while(set.contains(current)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            int cureentlength=i-left+1;
            
         
            length=Math.max(cureentlength,length);
            // right++;
        }

    return length;
    }
}