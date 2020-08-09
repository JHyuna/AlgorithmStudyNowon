"""https://programmers.co.kr/learn/courses/30/lessons/12922"""


def solution(n: int) -> str:
    a, b = divmod(n, 2)
    c = "수박" * a
    return c if b is 0 else c + "수"


if __name__ == "__main__":
    assert solution(3) == "수박수"
    assert solution(4) == "수박수박"
