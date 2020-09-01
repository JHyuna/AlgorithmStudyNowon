def solution(arr1,arr2):
    answer = [[0 for i in range(len(arr1[0]))] for y in range(len(arr1))]
    for i in range(len(arr1)):
        for j in range(len(arr1[i])):
            answer[i][j] = arr1[i][j]+arr2[i][j]

    return answer


a=[[1,2],[2,3]]
b=[[3,4],[5,6]]	
print(solution(a,b))
