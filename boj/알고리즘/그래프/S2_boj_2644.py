"""https://www.acmicpc.net/problem/2644"""

"""촌수계산"""


import sys 

from collections import deque


input = sys.stdin.readline

n = int(input())

start, end = map(int,input().split())

m = int(input())

# dict
"""
c_list = {}
for i in range(1,n+1):
    c_list[i] = set()
for i in range(m):
    a,b  = map(int,input().split())
    c_list[a].add(b)
    c_list[b].add(a)
"""

# list
c_list = [[] for _ in range(n+1)]
for i in range(m):
    a,b  = map(int,input().split())
    c_list[a].append(b)
    c_list[b].append(a)

result = [0]*(n+1)

def bfs(start,end):
    visited = []
    q = deque([start])

    while q:
        tmp = q.popleft()
        visited.append(tmp)
        for i in c_list[tmp]:
            if i not in visited:
                result[i] = result[tmp] + 1
                visited.append(i)
                q.append(i)
      

bfs(start,end)

if result[end] != 0:
    print(result[end])
else:
    print(-1)
#print(result[b] if result[b] != 0 else -1)
        





    