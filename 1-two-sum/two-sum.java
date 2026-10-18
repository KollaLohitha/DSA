class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
/* For this solution we are using a single loop upto n 
In worst case we have to check for upto last element so the TIME COMPLEXITY is O(n) and here we are using a HashMap to store the already seen numbers or elements . So, the SPACE COMPLEXITY is O(n) */