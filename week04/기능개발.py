from math import ceil

def solution(progresses,speeds):
    result = []
    tmp_list = [ceil((100-p)/s) for p,s in zip(progresses,speeds)]

    
    for i , tmp in enumerate(tmp_list):
        if i == 0:
            max_time = tmp
            result.append(1)
        elif tmp <= max_time:
            result[-1] += 1
        else:
            max_time = tmp
            result.append(1)
    return result

print(solution([93,30,55],[1,30,5]))
print(solution([95, 90, 99, 99, 80, 99],[1,1,1,1,1,1]))