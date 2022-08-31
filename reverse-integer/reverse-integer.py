class Solution:
    def reverse(self, x: int) -> int:
        temp = str(x)
        ck =False
        if temp[0]=='-':
            temp = temp[1:]
            ck=True
        temp = temp[::-1]
        if ck:
            temp='-'+temp
        if int(temp) > math.pow(2,31)-1 or int(temp) < math.pow(2,31)*-1:
            return 0;
        return int(temp)
        