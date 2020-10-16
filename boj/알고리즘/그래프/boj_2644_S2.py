"""https://www.acmicpc.net/problem/2644"""

"""촌수계산"""

import sys
from collections import deque
import sys
input = sys.stdin.readline
n = int(input())
a, b = map(int, input().split())
m = int(input())
s = [[] for i in range(n + 1)]
result = [0 for i in range(n + 1)]
def bfs(start):
    q = deque()
    q.append(start)
    visit = [0 for i in range(n + 1)]
    visit[start] = 1
    while q:
        d = q.popleft()
        for i in s[d]:
            if visit[i] == 0:
                visit[i] = 1
                result[i] = result[d] + 1
                q.append(i)
        print(result)
for i in range(m):
    x, y = map(int, input().split())
    s[x].append(y)
    s[y].append(x)
bfs(a)
print(result[b] if result[b] != 0 else -1)