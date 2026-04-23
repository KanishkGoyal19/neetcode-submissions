class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //first we map the array and find the frequency of each number
        int length = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+ 1);
        }
        //freq(num, frequency of number)
        List<Integer>[] buckets = new ArrayList[nums.length + 1]; // Array of lists
        for (int i = 0; i <= nums.length; i++) {
             buckets[i] = new ArrayList<>(); // Initialize each bucket
        }

        for(int num: freq.keySet()){
            buckets[freq.get(num)].add(num);
        }

        int[]ans = new int[k];
        int index = 0;
        for(int i = buckets.length-1; i > 0 && index < k; i--){
            for(int n : buckets[i]){
                ans[index++] = n;
                if(index == k){
                    return ans;
                }
            }
        }
        return ans;
    }
}
