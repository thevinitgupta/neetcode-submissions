class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        List<Integer> set = Arrays.stream(nums).distinct().boxed().collect(Collectors.toList());
        // System.out.println(set);
        int max = 1, prev = set.get(0), count = 0;
        for(Integer curr : set){
            if(curr==prev+1) {
                count++;
                max = Math.max(count, max);
            }
            else {
                count = 1;
            }
            prev = curr;
        }
        return max;
    }
}
