"""https://www.acmicpc.net/problem/1966"""


"""프린터 큐"""



import sys
from collections import deque

for _ in range(int(sys.stdin.readline().rstrip())):
    N,M = map(int,sys.stdin.readline().rstrip().split())
    
    print_Q = deque()

    for index,j in enumerate(deque(map(int,sys.stdin.readline().rstrip().split()))):
        print_Q.append((index,j))

    cnt = 0
    result = []
    while print_Q:
        tmp = print_Q.popleft()
        result.append(tmp)
        for i in print_Q:
            if tmp[1] < i[1]:
                print_Q.append(tmp)
                result.pop()
                break
        
    for i in result:
        if i[0] == M:
            print(result.index(i)+1)
        
            
"""

t = int(input())
for i in range(t):
    n, m = map(int, input().split())
    s = list(map(int, input().split()))
    s_ = [0 for i in range(n)]
    s_[m] = 1
    cnt = 0
    while True:
        if s[0] == max(s):
            cnt += 1
            if s_[0] == 1:
                print(cnt)
                break
            else:
                del s[0]
                del s_[0]
        else:
            s.append(s[0])
            del s[0]
            s_.append(s_[0])
            del s_[0]


"""


