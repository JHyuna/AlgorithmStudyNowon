"""https://www.acmicpc.net/problem/1713"""


"""후보 추천하기"""


def solution(N,R,R_list):

    result = []
    count_list = [ 0 for _ in range(R+1)]  ##
    

    for i in range(R):

        if R_list[i] in result:
            count_list[R_list[i]] += 1
        else:
            if len(result) == N:
                
               
                    min_r = result[0]
        
                    for j in result:
                        if count_list[min_r] > count_list[j]:
                            min_r = j
                        else:
                            continue
                    result.pop(result.index(min_r))
                    count_list[min_r] = 0

                    result.append(R_list[i])
                    count_list[R_list[i]] += 1
                
            else:
                result.append(R_list[i])
                count_list[R_list[i]] += 1

    return sorted(result)


N = int(input())
R = int(input())
R_list = list(map(int,input().split()))

result = solution(N,R,R_list)

print(*result)




"""
n=int(input())
m=int(input())
s=[*map(int,input().split())]
t,c=[],[]
for x in s:
  if x in t:
    c[t.index(x)]+=1
  else:
    if len(t)==n:
      i=c.index(min(c))
      t.pop(i)
      c.pop(i)
    t.append(x)
    c.append(1)
print(*sorted(t))

"""