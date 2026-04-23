class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twoSum = new HashMap<>(); 

        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];

            if (twoSum.containsKey(secondNumber)) {
                return new int[]{twoSum.get(secondNumber), i}; 
            }

            twoSum.put(nums[i], i);
        }

        return new int[]{};
    }
}
