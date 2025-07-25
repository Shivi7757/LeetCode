import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);  // sorting in ascending order
        int dup=0;    // an empty variable to store the value
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){  // if both are qual then 
               dup = nums[i];        // store it in the variable
            }
        }
        return dup;    // returns the duplicated value
    }
}