class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length(), l2 = t.length();
        if(l1!=l2) return false;
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        for(int i=0;i<l1;i++){
            char ch = a[i];
            boolean found = false;
            for(int j=0;j<l2;j++){
                if(ch==b[j]) {
                    found = true;
                    b[j] = '_';
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}
