class Solution {
    public int lengthOfLongestSubstring(String s) {
    String longest = "";
        String current = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!current.contains(String.valueOf(ch))) {
                current += ch;
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = current.substring(current.indexOf(ch) + 1) + ch;
            }
        }
        return Math.max(longest.length(), current.length()) ;
    }
}