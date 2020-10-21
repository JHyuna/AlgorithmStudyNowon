"""https://www.acmicpc.net/problem/20057"""

"""마법사 상어와 토네이도"""

"""2020년 하반기 오후 1번 """


dx = [-1,0,1,0]
dy = [0,1,0,-1]

direc_l = [(1,-1),(1,1),(0,-2),(0,2),(0,-1),(0,1),(-1,-1),(-1,1),(-2,0),(-1,0)]
direc_d = [(-1,-1),(1,-1),(-2,0),(2,0),(-1,0),(1,0),(-1,1),(1,1),(0,2),(0,1)]
direc_r = [(-1,-1),(-1,1),(0,-2),(0,2),(0,-1),(0,1),(1,-1),(1,1),(2,0),(1,0)]
direc_u = [(-1,1),(1,1),(-2,0),(2,0),(-1,0),(1,0),(-1,-1),(1,-1),(0,-2),(0,-1)]

def cal(x,y,tmp,d):

    f_sum = 0
    t_sum = 0


    if d == 'l':
        direc = direc_l
    elif d == 'd':
        direc = direc_d
    elif d == 'u':
        direc = direc_u
    else:
        direc = direc_r





    for i in range(10):
        if i == 0 or i == 1:
            tx = x + direc[i][0]
            ty = y + direc[i][1]
            if check_in(tx,ty):
                board[ty][tx] += (tmp*1)//100
                t_sum += (tmp*1)//100
            else:
                f_sum += (tmp*1)//100
        elif i == 2 or i == 3:
            tx = x + direc[i][0]
            ty = y + direc[i][1]
            if check_in(tx,ty):
                board[ty][tx] += (tmp*2)//100
                t_sum += (tmp*2)//100
            else:
                f_sum += (tmp*2)//100
        elif i == 4 or i == 5:
            tx = x + direc[i][0]
            ty = y + direc[i][1]
            if check_in(tx,ty):
                board[ty][tx] += (tmp*7)//100
                t_sum += (tmp*7)//100
            else:
                f_sum += (tmp*7)//100
        elif i == 6 or i == 7:
            tx = x + direc[i][0]
            ty = y + direc[i][1]
            if check_in(tx,ty):
                board[ty][tx] += (tmp*10)//100
                t_sum += (tmp*10)//100
            else:
                f_sum += (tmp*10)//100
        elif i == 8:
            tx = x + direc[i][0]
            ty = y + direc[i][1]
            if check_in(tx,ty):
                board[ty][tx] += (tmp*5)//100
                t_sum += (tmp*5)//100
            else:
                f_sum += (tmp*5)//100
        else:
            tx = x + direc[i][0]
            ty = y + direc[i][1]
            if check_in(tx,ty):
                board[ty][tx] += (tmp-(t_sum + f_sum))
            else:
                f_sum += (tmp-(t_sum + f_sum))



    return f_sum


def check_in(a,b):
    if 0<=a<N and 0<=b<N:
        return True
    else:
        False



N = int(input())
board = [list(map(int,input().split())) for _ in range(N)]

x = N//2
y = N//2

result = 0
r = 0

for i in range(N-1):
    for _ in range(2):
        for j in range(i+1):
            index = r%4
            x += dx[index]
            y += dy[index]
            tmp = board[y][x]
            board[y][x] = 0
            if index == 0:
                d = 'l'
            elif index == 1:
                d = 'd'
            elif index == 2:
                d = 'r'
            elif index == 3:
                d = 'u'

            ####print(y,x)
            ###
            result += cal(x,y, tmp, d)
            """
            for k in range(N):
                print(board[k])
            """

            ###
        r += 1

for i in range(N-1):
    x += dx[0]
    y += dy[0]
    tmp = board[y][x]
    ###print(y,x)

    ###
    result += cal(x,y, tmp, 'l')
    """
    for k in range(N):
        print(board[k])
    """
    ###

print(result)