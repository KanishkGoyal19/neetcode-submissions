class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> containsDuplicate = new HashSet<Integer>();
        for(Integer num : nums){
            if(containsDuplicate.contains(num)){
                return true;
            }
            containsDuplicate.add(num);
        }
        return false;
 
    }
}
