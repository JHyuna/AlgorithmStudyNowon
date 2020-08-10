def solution(answers):
    n_1 = [1,2,3,4,5]
    n_2 = [2,1,2,3,2,4,2,5]
    n_3 = [3,3,1,1,2,2,4,4,5,5]

    cnt_1 = cnt_2 = cnt_3 = 0

    for index, i in enumerate(answers):
        if i == n_1[index%len(n_1)]:
            cnt_1 += 1
        if i == n_2[index%len(n_2)]:
            cnt_2 += 1
        if i == n_3[index%len(n_3)]:
            cnt_3 += 1

    result =[cnt_1,cnt_2,cnt_3]

    m = max(result)

    return [index+1 for index,i in enumerate(result) if m == i]

print(solution([5]))