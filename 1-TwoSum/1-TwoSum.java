// Last updated: 10/20/2025, 4:06:59 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
             
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{j, i};
                }
            }
        }

    return new int[]{0, 0};

    }
}