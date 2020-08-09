"""https://programmers.co.kr/learn/courses/30/lessons/42889"""

from typing import List
from collections import Counter


def solution(N: int, stages: List[int]) -> List[int]:
    counter = Counter(stages)
    clear_count: int = sum(counter.values())
    fail_rates: List[float] = []

    for stage in range(1, N + 1):
        pending_count: int = counter.get(stage, 0)
        if clear_count is 0:
            fail_rates.append(0)
        else:
            fail_rate: float = pending_count / clear_count
            fail_rates.append(fail_rate)
            clear_count -= pending_count
    return sorted(range(1, N + 1), key=lambda x: fail_rates[x-1], reverse=True)


if __name__ == "__main__":
    assert solution(5, [2, 1, 2, 6, 2, 4, 3, 3]) == [3, 4, 2, 1, 5]
    assert solution(4, [4, 4, 4, 4, 4]) == [4, 1, 2, 3]
