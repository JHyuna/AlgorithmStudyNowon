"""https://programmers.co.kr/learn/courses/30/lessons/12937"""


def solution(num: int) -> str:
    return "Odd" if num % 2 is 1 else "Even"


if __name__ == "__main__":
    assert solution(3) == "Odd"
    assert solution(4) == "Even"
