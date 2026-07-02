class Solution {
    public boolean isAnagram(String s, String t) {
        int [] alpha = new int[26];
        for(char ch : s.toCharArray()){
            alpha[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            alpha[ch-'a']--;
        }
        for(int idx : alpha){
            if(idx!=0) return false;
        }
        return true;
    }
}
