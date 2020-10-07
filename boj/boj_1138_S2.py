"""https://www.acmicpc.net/problem/1138"""

"""한 줄로 서기"""


def solution(N,remember):


    result = [len(remember)]

    for index in range(N-2,-1,-1):
        result.insert(remember[index],index+1)
    

    
    return result



N = int(input())

remember = list(map(int,input().split()))

result = solution(N,remember)

print(*result)