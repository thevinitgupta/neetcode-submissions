class Solution {
    public int[] twoSum(int[] nums, int target) {
        // will only work for sorted arrays and NOT SPECIFIED THAT IT IS SORTED
        // Also, if I sort, the indices are not preserved
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int s = target - nums[i];
            if(map.containsKey(s)){
                return new int[]{map.get(s),i};
            }
            else {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
    
}
