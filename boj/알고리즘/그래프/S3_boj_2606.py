"""https://www.acmicpc.net/problem/2606"""


"""바이러스"""

#BFS standard

import sys
from collections import deque

N = int(sys.stdin.readline().rstrip())
C = int(sys.stdin.readline().rstrip())

dic = {}

for i in range(N):
    dic[i+1] = set()

for i in range(C):
    a,b = map(int,sys.stdin.readline().rstrip().split())
    dic[a].add(b)
    dic[b].add(a)   


def bfs(dic,start):
    visited = []

    q = deque([start])

    while q:
        tmp = q.popleft()
        visited.append(tmp)
        for i in dic[tmp]:
            if i not in visited and i not in q:
                q.append(i)

    return visited

print(len(bfs(dic,1))-1)


