"""https://programmers.co.kr/learn/courses/30/lessons/12915"""

from typing import List


def solution(strings: List[str], n: int) -> List[str]:
    sorted_strings: List[str] = sorted(strings)
    sorted_strings.sort(key=lambda s: s[n])
    return sorted_strings


if __name__ == "__main__":
    assert solution(["sun", "bed", "car"], 1) == ["car", "bed", "sun"]
    assert solution(["abce", "abcd", "cdx"], 2) == ["abcd", "abce", "cdx"]
