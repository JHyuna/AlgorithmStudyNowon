from collections import deque

def solution(prices):
    answer = []
    prices = deque(prices) # 데크 구현
    p_len = len(prices) #

    while p_len != 0: # 비어있는 상황 대비한 while
        current = prices.popleft() # 가장 안쪽값인 왼쪽 첫번째를 popleft로 꺼내서
        p_len -= 1 # 길이 줄여주고
        count = 0
        for j in prices: # 꺼낸 current랑 나머지랑 순차적으로 비교해서
            if current > j: # 꺼낸 current가 크면
                count += 1 # 카운트를 더하고 나오기
                break
            count += 1
        answer.append(count)
    return answer
