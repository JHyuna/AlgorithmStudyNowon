from collections import deque

def solution(prices):
    answer = []
    prices = deque(prices)
    p_len = len(prices)

    while p_len != 0:
        current = prices.popleft()
        p_len -= 1
        count = 0
        for j in prices:
            if current > j:
                count += 1
                break
            count += 1
        answer.append(count)
    return answer
