"""https://programmers.co.kr/learn/courses/30/lessons/12930"""

from typing import List


def solution(s: str) -> str:
    chars: List[str] = list(s)
    upper_case_turn: bool = True
    for i, c in enumerate(chars):
        chars[i] = c.upper() if upper_case_turn else c.lower()
        upper_case_turn = True if c == " " else not upper_case_turn
    return "".join(chars)


if __name__ == "__main__":
    assert solution("try hello world") == "TrY HeLlO WoRlD"
