"""https://programmers.co.kr/learn/courses/30/lessons/12950"""

from typing import List

ArrType = List[List[int]]


def solution(arr1: ArrType, arr2: ArrType) -> ArrType:
    return [[a_value + b_value for a_value, b_value in zip(a, b)] for a, b in zip(arr1, arr2)]


if __name__ == "__main__":
    assert solution([[1, 2], [2, 3]], [[3, 4], [5, 6]]) == [[4, 6], [7, 9]]
    assert solution([[1], [2]], [[3], [4]]) == [[4], [6]]
