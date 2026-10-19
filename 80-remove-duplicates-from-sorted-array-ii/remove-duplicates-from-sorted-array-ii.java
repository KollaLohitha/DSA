/* Here we are using the same approach used Remove Duplicates from Sorted Array.One change is that here an element can present at most twice . So, theonly condition is changed to nums[read] != nums[write-2] . It checks the element previous of 2 elements
    - TIME COMPLEXITY = O(N)
    - SPACE COMPLEXITY = O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int write = 2;
        for(int read = 2; read < nums.length; read++){
            if(nums[read] != nums[write-2]){
                nums[write] = nums[read];
                write++;
            }
        }
        return write;
    }
}