class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1, k = len - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    int tempJ = nums[j], tempK = nums[k];
                    while (j < k && nums[j] == tempJ) j++;
                    while (j < k && nums[k] == tempK) k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return res;
    }
}
