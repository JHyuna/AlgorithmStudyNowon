"""https://programmers.co.kr/learn/courses/30/lessons/12928"""

import math


def solution(n: int):
    result = set()
    for i in range(1, int(math.sqrt(n)) + 1):
        q, r = divmod(n, i)
        if r is 0:
            result.add(q)
            result.add(i)
    return sum(result)


if __name__ == "__main__":
    assert solution(12) is 28
    assert solution(5) is 6
