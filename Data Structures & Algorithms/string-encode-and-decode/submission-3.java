// import java.nio.charset.StandardCharsets;
class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String string : strs) {
            if(string.length()==0) string="^";
            byte [] byteArr = string.getBytes();
            String curr = Base64.getEncoder().encodeToString(byteArr);
            encoded+=curr+"|";
        }
        System.out.println(encoded);
        return encoded;
    }

    public List<String> decode(String str) {
        String [] strings = str.split("\\|");
        List<String> decodedStrs = new ArrayList<String>();
        if(str.length()==0) return decodedStrs;
        for(String value : strings) {
            
            byte [] byteArr = Base64.getDecoder().decode(value);
            String decodedStr = new String(byteArr);
            if(decodedStr.equals("^")) {
                decodedStr = "";
            }
            decodedStrs.add(decodedStr);
        }
        return decodedStrs;
    }
}
