"""https://www.acmicpc.net/problem/14889"""


"""스타트와 링크"""


from itertools import combinations   ## 조합

N = int(input())

A_list = [list(map(int,input().split())) for _ in range(N)]


members = [i for i in range(N)]

team = []

for t in list(combinations(members,N//2)):
    team.append(t)


diff_min = 1000000

for i in range(len(team)//2):

    # 팀 1

    t = team[i]
    t1_stat = 0

    for j in t:

        for k in t:

            t1_stat += A_list[j][k]

    # 팀 2

    t = team[-1-i]
    t2_stat = 0

    for j in t:

        for k in t:

            t2_stat += A_list[j][k]


    diff_min = min(diff_min, abs(t1_stat-t2_stat))
    
print(diff_min)

        



        

