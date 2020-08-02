def solution(s):
    a=list(s)

    a.sort(key = lambda x : x,reverse=True)

    a="".join(a)
    return a

print(solution("Zbcedfg"))