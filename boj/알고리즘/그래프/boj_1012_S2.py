"""https://www.acmicpc.net/problem/1012"""


"""유기농 배추"""


#그래프 standard


import sys

from collections import deque

input = sys.stdin

T = int(input.readline())

dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]
def bfs(x, y):
    queue = deque([[x, y]])
    while queue:
        tmp = queue.popleft()
        
        a, b = tmp[0], tmp[1]
        for i in range(4):
            q = a + dx[i]
            w = b + dy[i]
            if 0 <= q < N and 0 <= w < M and board[q][w] == 1:
                board[q][w] = 0
                queue.append([q, w])


for _ in range(T):
    M,N,K = map(int,input.readline().split())


    board = [list(0 for _ in range(M)) for _ in range(N)]
    
    
    #board에 해충 추가
    for _ in range(K):
        m,n = map(int,input.readline().split())
        board[n][m] = 1

    #print(board)
    cnt = 0

    for i in range(N):
        for j in range(M):
            if board[i][j] == 1:
                bfs(i,j)
                board[i][j] = 0
                cnt += 1

    print(cnt)







    

    

