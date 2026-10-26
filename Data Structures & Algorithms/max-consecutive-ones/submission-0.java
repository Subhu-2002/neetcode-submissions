class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCnt = 0;
        int currCnt = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                currCnt = 0;
                continue;
            }

            currCnt++;
            maxCnt = Math.max(currCnt, maxCnt);
        }

        return maxCnt;
    }
}