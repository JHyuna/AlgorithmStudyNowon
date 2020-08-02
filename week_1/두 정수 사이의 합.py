def solution(a, b):
    answer = 0
    if a >= b:
        a,b = b,a
    

    for i in range(a,b):
        answer += i



    return answer

print(solution(5,3))