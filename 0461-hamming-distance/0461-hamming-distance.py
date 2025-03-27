class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        count =0
        xor = x^y
        mask = 1
        for i in range(1,32):
            if(xor& mask!=0):
                count+=1
            mask<<=1    

        return count
    
        