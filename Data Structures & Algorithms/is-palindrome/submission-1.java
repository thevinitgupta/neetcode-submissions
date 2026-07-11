class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0, high = s.length()-1;
        // System.out.println(charList);
        while(low<high){
            if(!isValidChar(s.charAt(low))) {
                low++;
                continue;
            }
            if(!isValidChar(s.charAt(high))) {
                high--;
                continue;
            }

            // System.out.println(s.charAt(low)+"<->"+s.charAt(high));
            if(s.charAt(low++)!=s.charAt(high--)) return false;

        }
        return true;
    }
    private static boolean isValidChar(char ch){
        int lower = ch-'a', dig = ch-'0';
        return ((lower>=0 && lower<=25) || (dig>=0 && dig<=9));
    }
}
