def solution(s):
    if len(s)%2 == 1:
        index = len(s)//2
        return s[index]
    else:
        index_1 = len(s)//2-1
        return s[index_1:index_1+2]
solution('qwer')