class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0;
        int scount = 0;
        int cnt = 0;
        int currsubarray = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right]%2 == 1){
                cnt++;
                currsubarray = 0;
            }
            while(cnt == k){
                if(nums[left]%2 == 1){
                    cnt--;
                }
                currsubarray++;
                left++;
            }
            scount += currsubarray;
        }
        return scount;
    }
}