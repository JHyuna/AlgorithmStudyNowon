"""https://programmers.co.kr/learn/courses/30/lessons/42578"""

from typing import List
from collections import defaultdict
from functools import reduce


def solution(clothes: List[List[str]]):
    clothes_count = defaultdict(lambda: 1)  # 입지 않는 경우: +1
    for _, category in clothes:
        clothes_count[category] += 1

    # 모두 입지 않는 경우 -1
    return reduce(lambda x, y: x * y, clothes_count.values()) - 1


if __name__ == "__main__":
    assert solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]) == 5
    assert solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]) == 3
