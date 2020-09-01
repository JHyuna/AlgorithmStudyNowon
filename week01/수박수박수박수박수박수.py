def solution(n):
    if n%2 == 0:
        answer = '수박'*int(n/2)
    else:
        answer = '수박'*int(n/2)+'수'
    

    return answer

print(solution(5))