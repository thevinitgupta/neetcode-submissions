class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int [] alpha = new int[26];
            for(char ch : str.toCharArray()){
                alpha[ch-'a']++;
                // System.out.println(ch+"->"+alpha[ch-'a']);
            }
            String key = Arrays.toString(alpha);
            
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}
