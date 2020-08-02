"""https://programmers.co.kr/learn/courses/30/lessons/12912"""


def solution(a: int, b: int) -> int:
    if a == b:
        return a
    elif a < b:
        return sum(range(a, b+1))
    else:
        return sum(range(b, a+1))


if __name__ == "__main__":
    assert solution(3, 5) is 12
    assert solution(3, 3) is 3
    assert solution(5, 3) is 12

