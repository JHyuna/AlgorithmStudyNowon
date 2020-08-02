def solution(s,n):

    s.sort(key = lambda x : (x[n],x))


    return s

s=['abce', 'abcd', 'cdx']
print(solution(s,2))