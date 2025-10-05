class Solution:
    def isPalindrome(self, s: str) -> bool:
        s= s.lower()
        new=""
        for a in s:
            if a.isalnum():
                new+=a
        return new==new[::-1]        
        