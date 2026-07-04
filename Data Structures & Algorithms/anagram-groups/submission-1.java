class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int [] alpha = new int[26];
            for(char ch : str.toCharArray()){
                alpha[ch-'a']++;
                // System.out.println(ch+"->"+alpha[ch-'a']);
            }
            String cStr = "";
            for(int count : alpha){
                cStr += count+",";
            }
            List<String> cArr = new ArrayList<>();
            if(map.containsKey(cStr)){
                cArr = map.get(cStr);
            }
            cArr.add(str);
            map.put(cStr,cArr);
        }
        List<List<String>> values = new ArrayList<>();
        for(String key : map.keySet()){
            List<String> list = map.get(key);
            // System.out.println(key+"->"+list);
            values.add(list);
        }
        return values;
    }
}
