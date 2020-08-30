from collections import deque

def solution(priorities, location):
    answer = 0
    dq = deque([(v, i) for i, v in enumerate(priorities)])
    # (i,v) 그대로 생성하면 max(dq)가 중요도의 max가 아닌 index에 대해서 구해짐. 따라서 (v,i)순서로 생성

    while len(dq):
        first = dq.popleft()
        if max(dq)[0] > first[0]: # first로 뺀 가장 안쪽과 나머지를 비교해서 나머지에 max가 또 존재하면
            dq.append(first) # 뒤에 추가
        else:
            answer += 1 # 아니라면 answer에 1 더하고
            if first[1] == location: # location과 first의 index가 같을 경우에 break로 빠져나오기
                break
    return answer

solution([2, 1, 3, 2], 2)