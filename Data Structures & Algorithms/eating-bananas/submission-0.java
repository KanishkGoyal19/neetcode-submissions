class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //finding max in pile
        int max = 0;
        for(int num : piles){
            max = Math.max(max,num);
        }

        int low = 1;
        int high = max;
        int result = 0;

        while(low<=high){
            int mid = (low + high) / 2;
            int time = 0;
            for(int n : piles){
                time+= (n + mid - 1) / mid;
            }
            if(time <= h){
                result = mid;
                high  = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;

        
    }
}
