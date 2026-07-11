class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> charList = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isValidChar(ch)) charList.add(ch);
        }
        int low = 0, high = charList.size()-1;
        System.out.println(charList);
        while(low<high){
            if(charList.get(low++)!=charList.get(high--)) return false;
        }
        return true;
    }
    private static boolean isValidChar(char ch){
        int lower = ch-'a', dig = ch-'0';
        return ((lower>=0 && lower<=25) || (dig>=0 && dig<=9));
    }
}
