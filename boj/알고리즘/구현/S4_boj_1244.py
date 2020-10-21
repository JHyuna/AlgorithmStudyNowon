"""https://www.acmicpc.net/problem/1244"""


"""스위치 켜고 끄기"""



sn = int(input())

s_list = list(map(int,input().split()))

n = int(input())

c_list = [list(map(int,input().split())) for _ in range(n)]


def boy(s_list,num):
    for i in range(len(s_list)):
        if (i+1)%num == 0:
            if s_list[i] == 0:
                s_list[i] = 1
            else:
                s_list[i] = 0
        else:
            continue

def girl(s_list,num):
    #s,e = 0,len(s_list)-1
    i = 1
    while True:
        if num-i < 1 or num+i > len(s_list):
            
            break
        else:
            if s_list[num-i-1] == s_list[num+i-1]:
                #s= num-i-1
                #e= num+i-1
                i+=1
            else:
                break

    for j in range(num-i,num+i-2+1):
        #print(j)
        if s_list[j] == 0:
            s_list[j] = 1
        else:
            s_list[j] = 0


for k in c_list:
    if k[0] == 1:
        boy(s_list,k[1])
    else:
        girl(s_list,k[1])

for i in range(len(s_list)):
    if i == len(s_list)-1:
        print(s_list[i])
    elif i%20 == 19:
        print(s_list[i])
    else:
        print(s_list[i],end=' ')





