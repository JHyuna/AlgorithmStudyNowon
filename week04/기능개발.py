"""https://programmers.co.kr/learn/courses/30/lessons/42586"""

from typing import List
from math import ceil


def solution(progresses: List[int], speeds: List[int]) -> List[int]:
    result: List[int] = []
    deploy_times = [ceil((100 - p) / s) for p, s in zip(progresses, speeds)]
    left, highest = 0, deploy_times[0]
    for i, deploy_time in enumerate(deploy_times):
        if highest < deploy_time:
            result.append(i - left)
            left, highest = i, deploy_time
    result.append(i - left + 1)
    return result


if __name__ == "__main__":
    assert solution([93, 30, 55], [1, 30, 5]) == [2, 1]
    assert solution([95, 90, 99, 99, 80, 99], [1, 1, 1, 1, 1, 1]) == [1, 3, 2]
