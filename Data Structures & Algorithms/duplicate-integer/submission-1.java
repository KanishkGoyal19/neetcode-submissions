class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> containsDuplicate = new HashMap<Integer, Integer>();
        for(Integer num : nums){
            if(containsDuplicate.containsKey(num)){
                return true;
            }
            containsDuplicate.put(num,1);
            }
            return false;
 
    }
}
