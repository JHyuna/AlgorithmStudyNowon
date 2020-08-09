"""https://programmers.co.kr/learn/courses/30/lessons/67256"""

from typing import List


class Point:
    __slots__ = ("x", "y")

    def __init__(self, x: int, y: int):
        self.x = x
        self.y = y

    def distance(self, other: "Point") -> int:
        return abs(self.x - other.x) + abs(self.y - other.y)


coordinates = {
    "*": Point(0, 0), 0: Point(1, 0), "#": Point(2, 0),
    7: Point(0, 1), 8: Point(1, 1), 9: Point(2, 1),
    4: Point(0, 2), 5: Point(1, 2), 6: Point(2, 2),
    1: Point(0, 3), 2: Point(1, 3), 3: Point(2, 3),
}


def solution(numbers: List[int], hand: str) -> str:
    default_hand: str = "R" if hand == "right" else "L"
    left_hand: Point = coordinates["*"]
    right_hand: Point = coordinates["#"]

    def hand(n: int):
        if n is 1 or n is 4 or n is 7:
            return "L"
        elif n is 3 or n is 6 or n is 9:
            return "R"
        else:
            p: Point = coordinates[n]
            dis_from_left: int = p.distance(left_hand)
            dis_from_right: int = p.distance(right_hand)
            if dis_from_left == dis_from_right:
                return default_hand
            elif dis_from_left > dis_from_right:
                return "R"
            else:
                return "L"

    result: List[str] = ["L"] * len(numbers)
    for i, number in enumerate(numbers):
        h: str = hand(number)
        if h == "R":
            right_hand = coordinates[number]
            result[i] = h
        else:
            left_hand = coordinates[number]

    return "".join(result)


if __name__ == "__main__":
    assert solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], "right") == "LRLLLRLLRRL"
    assert solution([7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2], "left") == "LRLLRRLLLRR"
    assert solution([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], "right") == "LLRLLRLLRL"
