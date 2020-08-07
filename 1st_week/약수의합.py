def solution(n):
    output = []
    for i in range(1,n+1):
        if n%i==0:
            output.append(i)
    return sum(output)

solution(12)