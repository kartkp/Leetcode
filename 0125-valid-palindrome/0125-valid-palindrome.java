class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder newStr = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                newStr.append(ch);
            }
        }

        String clean = newStr.toString();
        String rev = newStr.reverse().toString();

        return clean.equals(rev);
    }
}
