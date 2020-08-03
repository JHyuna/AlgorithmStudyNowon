def solution(n):
    arr = "수박"
    answer = ""
    for i in range(n):
        j = i%2
        answer+=arr[j]
    return answer