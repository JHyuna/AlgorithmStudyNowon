"""https://www.acmicpc.net/problem/15658"""


"""연산자 끼워넣기2"""


#시간초과 
"""
from itertools import permutations

import sys


N = int(sys.stdin.readline().rstrip())

num_list = list(map(int,sys.stdin.readline().rstrip().split()))

op_list = list(map(int,sys.stdin.readline().rstrip().split()))

possible_op_list = []
for i in range(len(op_list)):
    if op_list[i] != 0:
        for j in range(op_list[i]):
            possible_op_list.append(i)

possible_op_list = set(permutations(possible_op_list,N-1))
#print(possible_op_list)


max_ = -sys.maxsize
min_ = sys.maxsize

#result = num_list[0]

for ops in possible_op_list:
    result = num_list[0]
    for i in range(1,len(num_list)):
        op = ops[i-1]
        #print('op ', op)
        if op == 0:
            result += num_list[i]
        elif op == 1:
            result -= num_list[i]
        elif op == 2:
            result *= num_list[i]
        else:
            if result < 0:
                result *= -1
                result = result//num_list[i]
                result *= -1
            else:
                result = result//num_list[i]
    #print(result)
    max_ = max(max_,result)
    min_ = min(min_,result)

print(max_)
print(min_)
"""

from sys import stdin
input = stdin.readline

n = int(input().rstrip())
a = list(map(int, input().rstrip().split()))
op = list(map(int, input().rstrip().split()))
mx, mn = -1e9, 1e9

def solve(index, ans, add, sub, mul, div):
    global mx, mn
    if index >= n:
        mx = max(mx, ans)
        mn = min(mn, ans)
        return
    if add:
        solve(index+1, ans+a[index], add-1, sub, mul, div)
    if sub:
        solve(index+1, ans-a[index], add, sub-1, mul, div)
    if mul:
        solve(index+1, ans*a[index], add, sub, mul-1, div)
    if div:
        solve(index+1, ans//a[index] if ans > 0 else -((-ans)//a[index]), add, sub, mul, div-1)

solve(1, a[0], op[0], op[1], op[2], op[3])
print(mx)
print(mn)
        
            
    




