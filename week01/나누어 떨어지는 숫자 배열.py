def solution(arr, divisor):
    answer = []
    for i in arr:
        if i % divisor == 0:
            answer.append(i)

    answer.sort()

    if not answer:
        answer.append(-1)

    return answer


print(solution([2, 36, 1, 3],7))
