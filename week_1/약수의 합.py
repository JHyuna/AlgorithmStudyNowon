def solution(n):
    n_sum = 0
    for i in range(1,n+1):
        if n%i == 0:
            n_sum += i
        else:
            continue
    
    return n_sum

print(solution(12))
