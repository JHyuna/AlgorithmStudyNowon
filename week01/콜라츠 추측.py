"""https://programmers.co.kr/learn/courses/30/lessons/12943"""


def solution(num: int) -> int:
    if num is 1:
        return 0

    for i in range(1, 501):
        q, r = divmod(num, 2)
        num = q if r is 0 else num * 3 + 1
        if num is 1:
            return i

    return -1


if __name__ == "__main__":
    assert solution(6) is 8
    assert solution(16) is 4
    assert solution(626331) is -1
    assert solution(1) is 0  # add a test case


