class Solution {
    public int maxSubArray(int[] nums) {
        int cu=nums[0];
        int max= nums[0];

        for(int i=1; i<nums.length; i++){
            cu = Math.max(nums[i],cu + nums[i]);
            max = Math.max(max,cu);

        }
        return max;
    }
}