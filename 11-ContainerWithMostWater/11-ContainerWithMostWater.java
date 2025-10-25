// Last updated: 10/26/2025, 12:08:20 AM
class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        if (n == 0) return 0;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;
        while(left<right){
            // int area = (right - left) * Math.min(height[left], height[right]);
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;

    }
}