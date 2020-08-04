def solution(n):
    n_list = list(i for i in str(n))
    n_list.sort(reverse=True)
    answer = ''.join(n_list)
    return int(answer)

print(solution(118723))