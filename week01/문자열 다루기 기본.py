"""https://programmers.co.kr/learn/courses/30/lessons/12918"""


def solution(s: str) -> bool:
    if (len(s) is 4 or len(s) is 6) and s.isdigit():
        return True
    return False


if __name__ == "__main__":
    assert solution("a234") is False
    assert solution("1234") is True
