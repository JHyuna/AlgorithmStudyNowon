"""https://programmers.co.kr/learn/courses/30/lessons/12910"""

from typing import List


def solution(arr: List[int], divisor: int) -> List[int]:
    result = [value for value in arr if value % divisor is 0]
    if not result:
        return [-1]
    result.sort()
    return result


if __name__ == "__main__":
    assert solution([5, 9, 7, 10], 5) == [5, 10]
    assert solution([2, 36, 1, 3], 1) == [1, 2, 3, 36]
    assert solution([3, 2, 6], 10) == [-1]