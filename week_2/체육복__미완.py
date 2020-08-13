def solution(n,lost,reserve):
    result = [1]*n
    
    for i in lost:
        result[i-1] = 0
    for i in reserve:
        result[i-1] = 2
    #print(result)
    for i in range(n-1):
        #print(i)
        if result[i] == 2 and result[i+1] == 0:
            result[i+1] += 1
            result[i] -= 1
    #print(result)
    for i in range(n-1,0,-1):
        if result[i] == 2 and result[i-1] == 0:
            result[i-1] += 1
            result[i] -= 1


    


    return n-(result.count(0))

print(solution(5,[2,3,4],[1,5]))
print(solution(5,[2,4],[3]))
print(solution(3,[3],[1]))


