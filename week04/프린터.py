"""https://programmers.co.kr/learn/courses/30/lessons/42587"""

from typing import List
from collections import deque, Counter


def solution(priorities: List[int], location: int) -> int:
    lowest, highest = priorities[location], max(priorities)
    priority_counter = Counter(priorities)
    tasks = deque((p, i) for i, p in enumerate(priorities) if p >= lowest)
    count: int = 0
    while True:
        task = tasks.popleft()
        if highest > task[0]:
            tasks.append(task)
        else:
            count += 1
            priority_counter[highest] -= 1
            if task[1] == location:
                return count

            if not priority_counter[highest]:
                del priority_counter[highest]
                highest = max(priority_counter)


if __name__ == "__main__":
    assert solution([2, 1, 3, 2], 2) == 1
    assert solution([1, 1, 9, 1, 1, 1], 0) == 5
    assert solution([1, 1, 1, 1, 1], 4) == 5
