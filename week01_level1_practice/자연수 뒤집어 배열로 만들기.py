"""https://programmers.co.kr/learn/courses/30/lessons/12932"""

from typing import List


def solution(n: int) -> List[int]:
    return list(map(int, str(n)[::-1]))


if __name__ == "__main__":
    assert solution(12345) == [5, 4, 3, 2, 1]
