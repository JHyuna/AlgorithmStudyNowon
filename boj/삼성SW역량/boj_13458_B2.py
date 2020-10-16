"""https://www.acmicpc.net/problem/13458"""

"""시험 감독"""

import math

N = int(input())
tester_num_list = list(map(int,input().split()))
B, C = map(int,input().split())


def solution(N, tester_num_list, B, c):
    result = N

    for i in range(N):

        tester_num_list[i] -= B

        if tester_num_list[i] <= 0:
            continue
        else:
            result += math.ceil(tester_num_list[i]/C)



    return result

print(solution(N,tester_num_list,B,C))



## 반례
# 1 1 (2 1)
# 2 (3 1) (7 1)