"https://programmers.co.kr/learn/courses/30/lessons/64061"

def solution(board,moves):
    result =[]
    cnt = 0
    for i in moves:
        for j in board:
            if j[i-1] != 0:
                if not result:
                    result.append(j[i-1])
                elif result[-1] == j[i-1]:
                    result.pop(-1)
                    cnt+=2
                else:
                    result.append(j[i-1])
                    
                j[i-1] = 0
                break
    
    return cnt

print(solution([[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]],[1,5,3,5,1,2,1,4]	))
