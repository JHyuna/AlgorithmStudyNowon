"""https://programmers.co.kr/learn/courses/30/lessons/12940"""

from typing import List
import math


def solution(n: int, m: int) -> List[int]:
    gcd: int = math.gcd(n, m)
    lcm: int = (n * m) // gcd
    return [gcd, lcm]


if __name__ == "__main__":
    assert solution(3, 12) == [3, 12]
    assert solution(2, 5) == [1, 10]
