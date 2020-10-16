"""https://www.acmicpc.net/problem/2615"""



"""오목"""


import sys

board = [list(map(int,sys.stdin.readline().rstrip().split())) for _ in range(19)]

a,b = 0,0
for i in range(19):
    for j in range(19):
        if board[i][j] == 1:
            pass
            


def check_5(board,i,j):
    if board[i+1][j] == 1:
        pass
    elif board[i][j+1] == 1:
        pass
    elif board[i+1][j+1] == 1:
        pass


    return 0