class Solution {
    public int minMoves2(int[] nums) {
        long minMoves = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            long moves = 0;
            long target = nums[i];
            for(int j = 0; j < nums.length; j++) {
                moves += Math.abs(nums[j] - target);
            }
            minMoves=Math.min(minMoves, moves);
        }
        return (int)minMoves;
        }
    }
