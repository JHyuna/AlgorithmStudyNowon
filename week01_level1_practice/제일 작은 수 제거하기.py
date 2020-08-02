"""https://programmers.co.kr/learn/courses/30/lessons/12935"""

from typing import List


def solution(arr: List[int]) -> List[int]:
    arr.remove(min(arr))
    return arr if arr else [-1]


if __name__ == "__main__":
    assert solution([4, 3, 2, 1]) == [4, 3, 2]
    assert solution([10]) == [-1]
