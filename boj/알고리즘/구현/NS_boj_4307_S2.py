"""https://www.acmicpc.net/problem/4307"""

"""개미"""



##이유 모름 ...

###input()시간초과###

import sys


N = int(input())

for _ in range(N):

    l, ant_num = map(int,sys.stdin.readline().rstrip().split())

    ant_list = []

    min_time = 0
    max_time = 0

    for _ in range(ant_num):
        ant = int(sys.stdin.readline().rstrip())
        if ant > l-ant:
            if min_time < l-ant:
                min_time = l-ant
            if max_time < ant:
                max_time = ant

        else:
            if min_time < ant:
                min_time = ant
            if max_time < l-ant:
                max_time = l-ant
        
    print(min_time, max_time)




