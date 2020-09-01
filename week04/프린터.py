"""https://programmers.co.kr/learn/courses/30/lessons/42587"""

def solution(priorities, location):

    if len(priorities) == 1:
        return 1

    result = []
    answer = 0
    for index , prior in enumerate(priorities):
        result.append((prior,index))

    while True:
        first = result[0]
        if max(result)[0] > first[0]:
            result.pop(0)
            result.append(first)
        else:
            result.pop(0)
            answer += 1
            if first[1] == location:
                break
        
    return answer


print(solution([2, 1, 3, 2],2))


