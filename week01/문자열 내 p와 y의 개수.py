def solution(s):
    answer = True
    s=s.upper()
    a=s.count('P')
    b=s.count('Y')
    if a!=b:
        answer=False


    return answer

print(solution("pPoooyY"))