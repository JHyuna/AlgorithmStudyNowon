def solution(s):

    l = len(s)
    if l%2 == 1:
        answer = s[int(l/2)]
    else:
        answer = s[int(l/2)-1:int(l/2+1)]

    return answer

print(solution("bcde"))
