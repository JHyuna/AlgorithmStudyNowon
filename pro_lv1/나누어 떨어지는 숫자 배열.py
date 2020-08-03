def solution(arr,divisor):
    answer = []
    ch = 0
    for i in range(len(arr)):
        if arr[i] % divisor == 0:
            ch+=1
            answer.append(arr[i])
    if ch == 0:
        answer.append(-1)
    answer.sort()
    return answer