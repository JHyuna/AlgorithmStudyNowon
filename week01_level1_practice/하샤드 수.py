"""https://programmers.co.kr/learn/courses/30/lessons/12947"""


def solution(x: int) -> bool:
    return x % sum(map(int, str(x))) is 0


if __name__ == "__main__":
    assert solution(10) is True
    assert solution(12) is True
    assert solution(11) is False
    assert solution(13) is False
