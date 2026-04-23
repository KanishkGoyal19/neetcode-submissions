class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0; // Left pointer
        int ans = 0; // Final answer

        for (int r = 0; r < s.length(); r++) { // Right pointer
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));  //if the right pointer encounters a duplicate, remove the chars at l, moving it forward till no duplicates
                l++;
            }
            set.add(s.charAt(r));  //add the right most character to the set
            ans = Math.max(ans, r - l + 1);  //keep updating the answeer for hte max
        }

        return ans;
    }
}
