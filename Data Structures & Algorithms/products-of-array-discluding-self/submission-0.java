class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int countZero = 0;
        int [] res = new int[nums.length];
        for(int num : nums){
            if(num==0){
                countZero++;
                continue;
            }
            prod *= num;
        }
        if(countZero>1) return res;
        for(int i=0;i<res.length;i++){
            if(nums[i]==0) {
                res = new int[nums.length];
                res[i] = prod;
                return res;
            }
            res[i] = prod/nums[i];
        }
        return res;
    }
}  
