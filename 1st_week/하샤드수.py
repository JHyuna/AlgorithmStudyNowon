# 풀이 더 줄일 방법 없는지 생각해보기
def solution(x):
    answer = 0
    for i in range(len(str(x))):
        answer += int(str(x)[i])
    return True if x%answer ==0 else False
solution(17)