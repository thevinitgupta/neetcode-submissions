class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int count=0;
            if(str.length()==0) sb.append("|");
            for(char ch : str.toCharArray()){
                if(count>0) sb.append("|");
                String bin = Integer.toBinaryString(ch);
                sb.append(bin);
                count++;
            }
            sb.append(",");
        }
        // System.out.println("encoded : "+sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        if(str.length()==0) return decoded;
        String [] words = str.split(",");
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            // System.out.println("word : "+word);
            String chars[] = word.split("\\|");
            for(String ch : chars){
                // System.out.println("charc : "+ch);
                int charCode = Integer.parseInt(ch,2);
                sb.append((char)charCode);
            }
            decoded.add(sb.toString());
        }
        return decoded;
    }
}
