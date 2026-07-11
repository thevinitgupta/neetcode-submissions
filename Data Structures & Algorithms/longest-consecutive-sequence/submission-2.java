class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<Integer>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        // System.out.println(set+","+set.contains(nums[0]));
        int max = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int count = 1;
                while(set.contains(num+count)){
                    count++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
