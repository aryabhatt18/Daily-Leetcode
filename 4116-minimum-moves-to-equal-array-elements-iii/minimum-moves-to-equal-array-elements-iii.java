class Solution {
    public int minMoves(int[] nums) {
        
        int moves = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++)
        {
            while(nums[i] != nums[nums.length - 1])
            {
                nums[i] += 1;
                moves++;
            }
        }
        return moves;
    }
}