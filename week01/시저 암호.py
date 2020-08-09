"""https://programmers.co.kr/learn/courses/30/lessons/12926"""


def alpha_move(c: str, n: int) -> str:
    if c == " ":
        return c

    case = 65 if c.isupper() else 97  # 65 is 'A', 97 is 'a'
    return chr(((ord(c) - case + n) % 26) + case)


def solution(s: str, n: int) -> str:
    return "".join(alpha_move(c, n) for c in s)


if __name__ == "__main__":
    assert solution("AB", 1) == "BC"
    assert solution("z", 1) == "a"
    assert solution("a B z", 4) == "e F d"
