/* Here we are traversing the array only once i.e., upto array length. So, the TIME COMPLEXITY is O(n) and we are not using any extra space so the SPACE COMPLEXITY is O(1)

APPROACH:-
    -Two Pointers
    - The read pointer scans the array
    - The write pointer maintains the position where the unique elements has to be placed
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int write = 1;
        for(int read = 1; read < nums.length; read++){
            if(nums[read] != nums[write-1]){
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}