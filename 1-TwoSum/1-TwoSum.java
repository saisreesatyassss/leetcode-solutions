// Last updated: 10/20/2025, 4:20:51 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    //     for(int i=0;i<nums.length;i++){
             
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]+nums[j]==target){
    //                 return new int[]{j, i};
    //             }
    //         }
    //     }

    // return new int[]{0, 0};

    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int x=target-nums[i];
        if(map.containsKey(x)){
            return new int[]{map.get(x),i};
        }
        map.put(nums[i],i);
    }
 return new int[]{}; // no result
    }
}