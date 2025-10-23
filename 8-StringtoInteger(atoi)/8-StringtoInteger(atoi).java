// Last updated: 10/23/2025, 5:20:16 PM
class Solution {
    public int myAtoi(String s) {
     int sign=1,i = 0;;
     s=s.trim();
     long res=0;

     if (s.length() == 0) return 0;
     if (s.charAt(0) == '-') { sign = -1; i++; } 
        else if (s.charAt(0) == '+') { i++; }

    while(i<s.length()){
        char ch = s.charAt(i); 
        if (ch < '0' || ch > '9') break;
        res = res * 10 + (ch - '0');
        if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE; // Handle overflow 
        if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE; i++; 
        
    }return (int) (sign * res);
    }
}