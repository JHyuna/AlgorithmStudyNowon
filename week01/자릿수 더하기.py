"""https://programmers.co.kr/learn/courses/30/lessons/12931"""


def solution(n: int) -> int:
    return sum(map(int, str(n)))


if __name__ == "__main__":
    assert solution(123) is 6
    assert solution(987) is 24
