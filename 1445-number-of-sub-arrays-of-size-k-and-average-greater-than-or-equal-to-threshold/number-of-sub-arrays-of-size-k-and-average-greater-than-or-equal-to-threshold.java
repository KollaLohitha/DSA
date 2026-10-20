/*
APPROACH - SLIDING WINDOW(Fixed Size)
TIME COMPLEXITY = O(N)
SPACE COMPLEXITY = O(1)

OPTIMIZATION:-
    Here w=i am calculating average by making avg = sum/k . We can precalculate it sum like targetSum = threshold * k
 */


class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, avg = 0, cnt = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        avg = sum / k;
        if(avg >= threshold){
            cnt++;
        }
        for(int i = k; i < arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            avg = sum / k;
            if(avg >= threshold){
                cnt++;
            }
        }
        return cnt; 
    }
}