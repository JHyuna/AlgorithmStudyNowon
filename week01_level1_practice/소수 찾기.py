from typing import List
import math


def solution(n: int) -> int:
    if n < 2:
        return 0

    sieve: List[bool] = [True for _ in range(n+1)]
    sieve[0] = sieve[1] = False  # 0, 1은 소수가 아님
    for target_n in range(2, int(math.sqrt(n)) + 1):
        if sieve[target_n] is True:
            sieve[target_n*2::target_n] = [False] * ((n // target_n) - 1)

    return sieve.count(True)


if __name__ == "__main__":
    assert solution(10) is 4
    assert solution(5) is 3
    assert solution(7919) is 1000
