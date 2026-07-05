class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0) return "";
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int size = str.length();
            sb.append(size);
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int left = 0, right=0, count = 0, size = str.length();
        if(size==0) return decoded;
        while(left<size && right<=size){
            if(str.charAt(right)=='#'){
                int currSize = Integer.parseInt(str.substring(left,right));
                if(currSize==0) {
                    decoded.add("");
                    right++;
                    left=right;
                    continue;
                }

                left = right+1;
                right = left+currSize;
                String curr = str.substring(left,right);
                decoded.add(curr);
                left=right;
            }
            right++;
        }
        return decoded;
    }
}
