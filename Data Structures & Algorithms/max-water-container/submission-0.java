class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int maxVol = 0;
        while(i < j){
            int small = Math.min(heights[i], heights[j]);
            int vol = (j-i) * small;
            //move the smaller 
            if(small == heights[i]){
                i++;
            }
            else if(small == heights[j]){
                j--;
            }
            //update maxVol
            if(maxVol < vol){
                maxVol = vol;
            }
        }
        return maxVol;
        
    }
}
