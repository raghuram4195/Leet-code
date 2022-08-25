class Solution:
    def isPalindrome(self, x: int) -> bool:
        i=0
        stringg=str(x)
        j= len(stringg) - 1
        while(i<j):
            if(stringg[i]!=stringg[j]):
                return False
            i=i+1
            j=j-1
        return True;
            
        