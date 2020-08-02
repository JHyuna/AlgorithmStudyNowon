"""https://programmers.co.kr/learn/courses/30/lessons/12944"""

from typing import List


def solution(arr: List[int]) -> float:
    return sum(arr) / len(arr)


if __name__ == "__main__":
    assert solution([1, 2, 3, 4]) == 2.5
    assert solution([5, 5]) == 5
