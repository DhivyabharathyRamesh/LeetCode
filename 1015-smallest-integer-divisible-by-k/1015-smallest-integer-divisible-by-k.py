class Solution(object):
    def smallestRepunitDivByK(self, k):
        """
        :type k: int
        :rtype: int
        """
        rem = 1 % k     
        length = 1     

        seen = set() 
    
        while rem != 0:
         if rem in seen:   
             return -1
         seen.add(rem)
        
         rem = (rem * 10 + 1) % k  
         length += 1               
    
        return length