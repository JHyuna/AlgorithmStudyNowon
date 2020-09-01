def solution(arr):
    answer =[arr[0]]
    l = len(arr)
    for i in range(1,l):
        if arr[i-1] == arr[i]:
            continue
        else:
            answer.append(arr[i])
        
            

    return answer


a = [1,1,3,3,0,1,1]

print(solution(a))

a=[1,2,4,4,5]