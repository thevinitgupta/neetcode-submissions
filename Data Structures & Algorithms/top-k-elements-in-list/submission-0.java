class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[][] freq = new int[2001][2];
        for(int num : nums){
            int ind = num+1000;
            freq[ind][1]++;
            freq[ind][0] = num;
        }
        Arrays.sort(freq, (a, b) -> {
            return b[1]-a[1];
        });
        int [] topK = new int[k];
        int count = 0;
        for(int [] fVal : freq){
            topK[count++] = fVal[0];
            if(count==k) break; 
        }
        return topK;
    }
}
