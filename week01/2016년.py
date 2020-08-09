"""https://programmers.co.kr/learn/courses/30/lessons/12901?language=python3"""

MONTHS = (31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
WEEK_CHAR = ("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")


def solution(a: int, b: int) -> str:
    days: int = sum(MONTHS[:a-1]) + b
    return WEEK_CHAR[days % 7]


if __name__ == "__main__":
    assert solution(5, 24) == "TUE"
