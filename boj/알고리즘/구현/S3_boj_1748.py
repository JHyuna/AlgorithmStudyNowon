"""https://www.acmicpc.net/problem/1748"""


"""수 이어 쓰기 1 """



N = int(input())

result = 0

###시간초과
"""
def cnt_d(i):
    cnt = 0
    while i!=0:
        i=i//10
        cnt += 1

    return cnt

for i in range(1,N+1):
    result += cnt_d(i)


print(result)
"""

##시간초과
"""
n_str =''
for i in range(1,N+1):
    n_str += str(i)

print(len(n_str))
"""




tmp = 0
for i in range(9):
    if 10**i <= N < 10**(i+1):
        tmp = i+1
#print(tmp)
for i in range(0,tmp-1):
    result = result + (10**(i+1)-1-10**i + 1)*(i+1)

result += tmp*(N-10**(tmp-1)+1)

print(result)


#well
"""

n = input()
n_len = len(n) - 1
c = 0
i = 0
while i < n_len:
    c += 9 * (10 ** i) * (i + 1)
    i += 1
c += ((int(n) - (10 ** n_len)) + 1) * (n_len + 1)
print(c)

"""


"""

hash_map = {0:1,1:2,2:3,3:4,4:5,5:6,6:7,7:8,8:9,9:10}

tmp = 0
for i in range(9):
    if 10**i <= N < 10**(i+1):
        tmp = i+1
        break
#print(tmp)

for i in range(tmp-1):
    result += hash_map[i]*(10**(i+1)-10**(i))

result += hash_map[tmp-1]*(N-10**(tmp-1)+1)

print(result)
"""






