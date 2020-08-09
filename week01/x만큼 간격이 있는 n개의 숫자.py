"""https://programmers.co.kr/learn/courses/30/lessons/12954"""

from typing import List


def solution(x: int, n: int) -> List[int]:
    return [x * i for i in range(1, n + 1)]


if __name__ == "__main__":
    assert solution(2, 5) == [2, 4, 6, 8, 10]
    assert solution(4, 3) == [4, 8, 12]
    assert solution(-4, 2) == [-4, -8]
