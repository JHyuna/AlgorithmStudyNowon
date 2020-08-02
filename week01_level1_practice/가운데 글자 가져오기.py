"""https://programmers.co.kr/learn/courses/30/lessons/12903?language=python3"""


def solution(s: str) -> str:
    mid: int = len(s) // 2
    return s[mid] if len(s) % 2 is 1 else s[mid-1:mid+1]


if __name__ == "__main__":
    assert solution("abcde") == "c"
    assert solution("qwer") == "we"
