"""https://programmers.co.kr/learn/courses/30/lessons/42587"""
from collections import deque

def solution(priorities, location):

    result = deque([(prior,index) for index,prior in enumerate(priorities)])
    answer = 0

    while True:
        first = result[0]
        if max(result)[0] > first[0]:
            result.popleft()
            result.append(first)
        else:
            result.popleft()
            answer += 1
            if first[1] == location:
                break
        
    return answer


print(solution([2, 1, 3, 2],2))
print(solution([1,1],1))
print(solution([1],0))

