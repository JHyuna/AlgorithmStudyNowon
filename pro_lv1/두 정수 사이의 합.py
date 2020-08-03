def solution(a,b):
    if a > b:
        a,b=b,a
    if b-a != 0:
        answer = a+b
    else:
        answer = a
    c = b-a
    for i in range(1,c):
        answer += a+i
    return answer