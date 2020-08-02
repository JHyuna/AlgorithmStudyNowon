def solution(n):
    
    cnt = 0
    for i in range(2,n+1):
        flg = True
        for j in range(2,i):
            if i%j ==0:
                flg = False
                break
        if flg == True:
            
            cnt+=1


    return cnt
    

print(solution(10))

            
