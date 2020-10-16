"""https://www.acmicpc.net/problem/14888"""

"""연산자 끼워넣기 """




from itertools import permutations


N = int(input())

N_list = list(map(int,input().split()))

O_N_list = list(map(int,input().split()))

O_list = []

for i in range(len(O_N_list)):
    if O_N_list[i] != 0:
        for j in range(O_N_list[i]):
            O_list.append(i)
        
    
Possible_o = set(permutations(O_list,N-1))  ## list 사용시 시간초과 ### ex) 4 0 0 0 -> (++++)를 하나로


#print(O_list)
#print(Possible_o)


max_result = -100000000
min_result = 100000000
for i in Possible_o:
    #print(N_list)
    result = N_list[0]

    for j in range(1,len(N_list)):
        if i[j-1] == 0:
            result += N_list[j]
        elif i[j-1] == 1:
            result -= N_list[j]
        elif i[j-1] == 2:
            result *= N_list[j]
        else:
            if result < 0:
                result *= -1
                result = result//N_list[j]
                result *= -1
            else:
                result = result//N_list[j]



    if max_result  <= result:
        max_result = result
    if min_result >= result:
        min_result = result
    



print(max_result)
print(min_result)


######################

"""
N = int(input())
nums = list(map(int, input().split()))
add, sub, mul, div = map(int, input().split())

min_, max_ = 1e9, -1e9

def dfs(i, res, add, sub, mul, div):
    global max_, min_
    if i == N:
        max_ = max(res, max_)
        min_ = min(res, min_)
        return

    else:
        if add:
            dfs(i+1, res+nums[i], add-1, sub, mul, div)
        if sub:
            dfs(i+1, res-nums[i], add, sub-1, mul, div)
        if mul:
            dfs(i+1, res*nums[i], add, sub, mul-1, div)
        if div:
            dfs(i+1, int(res/nums[i]), add, sub, mul, div-1)   #int()

dfs(1, nums[0], add, sub, mul, div)
print(max_)
print(min_)
"""

        

        








