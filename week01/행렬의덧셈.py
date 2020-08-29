# 마지막 test 17에서 시간초과 발생
def solution(arr1, arr2):
    for element in arr1:
        answer = [[arr1[i][j]+arr2[i][j] for j in range(len(element))] for i in range(len(arr1))]
    return answer
solution( [[1,2],[2,3]], [[3,4],[5,6]] )

# 똑같은데 약간 다른 풀이 있길래 참고. 뭔 차인지 사실 잘 모르겠음
# 평균적으로 느린데 test 17 통과....
def solution(arr1,arr2):
    answer = [[arr1[i][j] + arr2[i][j] for j in range(len(arr1[0]))] for i in range(len(arr1))]
    return answer

solution( [[1,2],[2,3]], [[3,4],[5,6]] )  