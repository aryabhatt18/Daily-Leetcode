class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
         int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        List<Integer> ans = new ArrayList<>();

        for (int x = min + 1; x < max; x++) {

            boolean found = false;

            for (int num : nums) {
                if (num == x) {
                    found = true;
                    break;
                }
            }

            if (!found)
                ans.add(x);
        }

        return ans;

    }
}