class Solution {
    public int removeDuplicates(int[] nums) {
       // int k=1;
        // for(int i=1; i<nums.length;i++){
        //     if(nums[i] != nums[i-1]){
        //         nums[k] = nums[i];
        //         k++;
                            
        //     }
        // }
        // return k;
        Set<Integer> set = new HashSet<>();

        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}