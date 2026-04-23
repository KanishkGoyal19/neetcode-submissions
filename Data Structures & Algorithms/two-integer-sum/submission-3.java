class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int second = target-nums[i];
            if(ans.containsKey(second)){
                return new int[]{ans.get(second), i};
            }
            ans.put(nums[i], i);

        }
        return new int[]{};       
    }
}
