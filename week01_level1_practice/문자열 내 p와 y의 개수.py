"""https://programmers.co.kr/learn/courses/30/lessons/12916"""


def solution(s: str) -> bool:
    count: int = 0
    for c in s:
        if c == "p" or c == "P":
            count += 1
        elif c == "y" or c == "Y":
            count -= 1

    return not bool(count)


if __name__ == "__main__":
    assert solution("pPoooyY") is True
    assert solution("Pyy") is False
