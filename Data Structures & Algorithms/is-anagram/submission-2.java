class Solution {
    public boolean isAnagram(String s, String t) {
        char [] sc = s.toCharArray();
        char [] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        // System.out.println(sc);
        // System.out.println(tc);
        String ss = new String(sc);
        String st = new String(tc);
        // System.out.println(ss);
        // System.out.println(st);
        return ss.equals(st);
    }
}
