def solution(n,stage):
    fail_rate =[0]*n
    player = len(stage)
    for index, i in enumerate(range(n),1):
        if player == 0:
            fail_rate[i] = (index,0)
            continue
        fail_rate[i] = (index,stage.count(i+1)/player)
        player -= stage.count(i+1)
    fail_rate.sort(key = lambda x: -x[1])
    result = [i[0] for i in fail_rate]
    return result

print(solution(4,[1,2,1]))






