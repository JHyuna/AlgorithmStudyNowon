def solution(n):
    if n == 1:
        return 0
    for cnt in range(500):
        if n % 2  == 0 :
            n /= 2
            if n == 1:
                break
        else:
            n = n*3 +1
            if n == 1:
                break
        if cnt == 499:
            return -1
    return cnt+1

print(solution(1))
    