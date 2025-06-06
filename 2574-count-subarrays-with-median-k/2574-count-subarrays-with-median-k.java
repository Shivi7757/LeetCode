class Solution {
    public int countSubarrays(int[] nums, int k) {
        int idx = 0;
        
        for (int i = 0; i < nums.length; ++i){
            if (nums[i] == k){
                idx = i;
                break;
            }
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        
        for (int i = idx; i < nums.length; ++i){
            sum += nums[i] == k ? 0 : nums[i] > k ? 1 : -1;
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        long result = 0;
        sum = 0;
        
        for (int i = idx; i >= 0; --i){
            sum += nums[i] == k ? 0 : nums[i] > k ? 1 : -1;
            
            result += map.getOrDefault(0 - sum , 0);
            result += map.getOrDefault(1 - sum , 0);
        }
        
        return (int) result;
    }
}
