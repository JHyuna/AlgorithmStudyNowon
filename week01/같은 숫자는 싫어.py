"""https://programmers.co.kr/learn/courses/30/lessons/12906"""

from typing import List


def solution(arr: List[int]) -> List[int]:
    result: List[int] = []
    last = None
    for value in arr:
        if value != last:
            result.append(value)
            last = value
    return result


assert solution([1, 1, 3, 3, 0, 1, 1]) == [1, 3, 0, 1]
