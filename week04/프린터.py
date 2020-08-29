from collections import deque

def solution(priorities, location):
    answer = 0
    dq = deque([(v, i) for i, v in enumerate(priorities)])
    # (i,v) 그대로 생성하면 max(dq)가 중요도의 max가 아닌 index에 대해서 구해짐. 따라서 (v,i)순서로 생성

    while len(dq):
        first = dq.popleft()
        if max(dq)[0] > first[0]:
            dq.append(first)
        else:
            answer += 1
            if first[1] == location:
                break
    return answer

solution([2, 1, 3, 2], 2)