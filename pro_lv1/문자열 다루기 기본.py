def solution(s):
    count = 0
    if len(s) == 4 or len(s) == 6:
        for i in range(len(s)):
            if s[i].isalpha() == False:
                count +=1
        
    if count == len(s):
        return True
    else:
        return False