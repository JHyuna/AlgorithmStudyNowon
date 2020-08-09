"""https://programmers.co.kr/learn/courses/30/lessons/42840"""

from typing import List
from itertools import cycle


def solution(answers: List[int]) -> List[int]:
    a = cycle((1, 2, 3, 4, 5))
    b = cycle((2, 1, 2, 3, 2, 4, 2, 5))
    c = cycle((3, 3, 1, 1, 2, 2, 4, 4, 5, 5))

    a_count = b_count = c_count = 0
    for answer in answers:
        if answer == next(a):
            a_count += 1
        if answer == next(b):
            b_count += 1
        if answer == next(c):
            c_count += 1

    scores = (a_count, b_count, c_count)
    max_score = max(scores)
    return [i for i, score in enumerate(scores, start=1) if score == max_score]


if __name__ == "__main__":
    assert solution([1, 2, 3, 4, 5]) == [1]
    assert solution([1, 3, 2, 4, 2]) == [1, 2, 3]
