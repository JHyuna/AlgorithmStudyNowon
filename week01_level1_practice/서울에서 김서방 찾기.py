"""https://programmers.co.kr/learn/courses/30/lessons/12919"""

from typing import List


def solution(seoul: List[str]) -> str:
    return f'김서방은 {seoul.index("Kim")}에 있다'


if __name__ == "__main__":
    assert solution(["Jane", "Kim"]) == "김서방은 1에 있다"
