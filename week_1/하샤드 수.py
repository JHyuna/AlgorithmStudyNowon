def solution(n):
    n_sum = sum([int(i) for i in str(n)])
    
    if n % n_sum == 0:
        return True 
    else:
        return False
    


print(solution(13))
    
