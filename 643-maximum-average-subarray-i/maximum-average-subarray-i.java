class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1){
            return nums[0] / k;
        }
        double sum = 0.0;
        double avg = 0.0;
        double maxAvg = Double.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        maxAvg = sum / k;
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            avg = sum/k;
            maxAvg = Math.max(avg,maxAvg);
        }
        return maxAvg;
    }
}