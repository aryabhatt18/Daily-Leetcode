class Solution {
    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums);
        int moves = 0;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] <= nums[i - 1])
            {
                int updated = nums[i - 1] + 1;
                moves += updated - nums[i];
                nums[i] = updated;
            }
        }
        return moves;
        
    }
}