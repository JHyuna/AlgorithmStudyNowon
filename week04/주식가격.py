"""https://programmers.co.kr/learn/courses/30/lessons/42584"""

from typing import List


def solution(prices: List[int]) -> List[int]:
    stack: List[int] = []
    result: List[int] = [-1] * len(prices)
    for i, price in enumerate(prices):
        while stack and prices[stack[-1]] > price:
            top_index: int = stack.pop()
            result[top_index] = i - top_index
        stack.append(i)

    while stack:
        top_index = stack.pop()
        result[top_index] = i - top_index

    return result


if __name__ == "__main__":
    assert solution([1, 2, 3, 2, 3]) == [4, 3, 1, 1, 0]
    assert solution([6, 2, 1, 7, 3]) == [1, 1, 2, 1, 0]
    assert solution([5, 1, 1]) == [1, 1, 0]
    assert solution([7, 6, 5, 4, 3, 2, 1]) == [1, 1, 1, 1, 1, 1, 0]
    assert solution([3, 4, 2, 6, 5]) == [2, 1, 2, 1, 0]

