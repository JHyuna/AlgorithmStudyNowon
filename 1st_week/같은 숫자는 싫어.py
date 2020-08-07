# 풀이방법 -1
# 문제는 다 맞지만 효율성이 없어서 떨어짐
def solution(arr):
    for i in range(len(arr)-1):
        if arr[i] == arr[i+1]:
            arr[i]='*'
        answer = arr
    while '*' in answer:
        answer.remove('*')
    return answer

solution([1,1,3,3,0,1,1])

# 풀이방법 -2
# Index Error가 뜨는 거 주의
def solution(arr):
    answer = []
    # 첫번째 요소는 어차피 중복 되든 말든 그냥 추가
    answer.append(arr[0])
    # 같은 거에 집중해서 지우면 index가 줄어서 에러 뜨므로
    # 다른 경우를 추가하는 것으로 하자
    for i in range(1,len(arr)):
        if arr[i] != arr[i-1]:
            answer.append(arr[i])
    return answer

solution([1,1,3,3,0,1,1])