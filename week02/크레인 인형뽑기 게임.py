"""https://programmers.co.kr/learn/courses/30/lessons/64061"""

from typing import List


def solution(board: List[List[int]], moves: List[int]) -> int:
    N: int = len(board)
    cache: List[int] = [N] * N  # if cache element == n then empty column
    stack: List[int] = [0]
    count: int = 0

    # Memorize column indexes
    for col in range(N):
        for row in range(N-1, -1, -1):
            if not board[row][col]:
                break
            cache[col] = row

    # Pick dolls
    for move in moves:
        col: int = move - 1
        row = cache[col]
        if row == N:  # empty column
            continue

        cache[col] += 1
        doll: int = board[row][col]
        if stack[-1] != doll:
            stack.append(doll)
        else:
            count += 2
            stack.pop()

    return count


if __name__ == "__main__":
    assert solution([[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]], [1,5,3,5,1,2,1,4]) == 4