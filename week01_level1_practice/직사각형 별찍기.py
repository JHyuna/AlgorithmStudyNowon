"""https://programmers.co.kr/learn/courses/30/lessons/12969"""


n, m = map(int, input().split())

row: str = "*" * n
for _ in range(m):
    print(row)
