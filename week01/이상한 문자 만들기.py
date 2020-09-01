def solution(s):
    s_list = []
    for i in s.split():
        answer = ''
        for n,c in enumerate(i):
            if n%2==0:
                answer += c.upper()
            else:
                answer += c.lower()
        s_list.append(answer)
    return ' '.join(s_list)

print(solution('try aa'))

