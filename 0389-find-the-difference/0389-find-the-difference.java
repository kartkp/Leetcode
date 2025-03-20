class Solution {
    public char findTheDifference(String s, String t) {
        char c =0;
        for (int i= 0; i<s.length(); ++i){
            c ^=s.charAt(i);
        }
        for (int i = 0; i< t.length(); ++i){
            c ^= t.charAt(i);
        }
        return c;}}
        // int[] count = new int[26];

//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             count[s.charAt(i) - 'a']--;
//             count[t.charAt(i) - 'a']++;
//         }
//         count[t.charAt(n) - 'a']++;
//         int c = 0;
//         for (int i = 0; i < 26; i++) {
//             if (count[i] == 1) {
//                 c = i + 'a';
//                 break;
//             }
//         }
//         return (char) c;
//     }
// }