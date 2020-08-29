"""https://programmers.co.kr/learn/courses/30/lessons/42583"""

from typing import List, Deque
from collections import deque


def solution(bridge_length: int, weight: int, truck_weights: List[int]) -> int:
    truck_weights.reverse()
    bridge: Deque[int] = deque([0] * bridge_length)
    bridge_weight: int = 0
    count: int = bridge_length
    while truck_weights:
        count += 1
        bridge_weight -= bridge.popleft()

        if truck_weights[-1] + bridge_weight > weight:
            bridge.append(0)
        else:
            w = truck_weights.pop()
            bridge_weight += w
            bridge.append(w)
    return count


if __name__ == "__main__":
    assert solution(2, 10, [7, 4, 5, 6]) == 8
    assert solution(100, 100, [10]) == 101
    assert solution(100, 100, [10, 10, 10, 10, 10, 10, 10, 10, 10, 10]) == 110
