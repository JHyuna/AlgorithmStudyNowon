"""https://programmers.co.kr/learn/courses/30/lessons/12917"""


from typing import List


def solution(s: str):
    l: List[str] = list(s)
    l.sort(reverse=True)
    return "".join(l)


if __name__ == "__main__":
    assert solution("Zbcdefg") == "gfedcbZ"

