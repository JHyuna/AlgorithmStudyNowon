"""https://www.acmicpc.net/problem/1168"""



"""요세푸스 문제2"""

from collections import deque

N,K = map(int,input().split())

p_list = deque(i for i in range(N))

result = []

while p_list:
    p_list.rotate(-(K-1))
    result.append(p_list.popleft()+1)


print("<",end='')

for i in range(len(result)):
    if i == len(result)-1:
        print(result[i],end="")
        print(">")
    else:
        print(result[i],end='')
        print(',',end=' ')

