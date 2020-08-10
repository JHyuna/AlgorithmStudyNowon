import math

def solution(n):
    cnt = 0
    for i in range(1,int(math.sqrt(n+1))):
        if n % i == 0:
            cnt += 1
        
    if cnt==1:
        return True
    else:
        return False

print(solution(17))