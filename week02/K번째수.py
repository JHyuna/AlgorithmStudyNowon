# i , j, k가 다듬어 지지 않은 형태의 답
def solution(array,commands):
    answer = []
    for n in commands:
        i = n[0]
        j = n[1]
        k = n[2]
        answer.append(sorted(array[i-1:j])[k-1])
    return answer

# i, j, k를 한번에 튜플로 표현해주면 축약 가능
def solution2(array,commands):
    answer = []
    for n in commands:
        i,j,k = n
        answer.append(sorted(array[i-1:j])[k-1])
    return answer
solution2([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]])

# 대박
def solution(array, commands):
    return list(map(lambda x:sorted(array[x[0]-1:x[1]])[x[2]-1], commands))