"""https://programmers.co.kr/learn/courses/30/lessons/12934"""

import math


def solution(n: int) -> int:
    sqrt_num: float = math.sqrt(n)
    if sqrt_num.is_integer():
        return int((sqrt_num + 1) ** 2)
    return -1


if __name__ == "__main__":
    assert solution(121) is 144
    assert solution(3) is -1
