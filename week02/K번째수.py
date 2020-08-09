"""https://programmers.co.kr/learn/courses/30/lessons/42748"""

from typing import List


def solution(array: List[int], commands: List[List[int]]) -> List[int]:
    result = []
    for i, j, k in commands:
        arr: List[int] = array[i-1:j]
        arr.sort()
        result.append(arr[k-1])

    return result


if __name__ == "__main__":
    assert solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]) == [5, 6, 3]
