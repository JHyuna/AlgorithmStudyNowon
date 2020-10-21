"""https://www.acmicpc.net/problem/1051"""

"""숫자 정사각형"""


def solution():

    N, M = map(int,input().split())
    square = []
    for i in range(N):
        square.append(list(map(int,input())))

    cnt = 0
    tmp = -1
    for i in range(min(N,M)-1,-1,-1):
        #print(i)
        for j in range(N-i):
            #print('j',j)
            for k in range(M-i):
                #print('k',k)
                tmp = square[j][k]
                if tmp == square[j][k+i] and tmp == square[j+i][k] and tmp == square[j+i][k+i]:
                    cnt = i+1
                    #print(cnt)
                    return cnt**2
                else:
                    continue

print(solution())