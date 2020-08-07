# 들여쓰기랑 마지막에 return 끝내는 순서 주의
def solution(arr, divisor):
    answer = []
    for e in arr:
        if e % divisor == 0:
            answer.append(e)

    if len(answer) == 0:
        return [-1]

    else:
        return sorted(answer)


solution([5, 9, 7, 1000], 5)