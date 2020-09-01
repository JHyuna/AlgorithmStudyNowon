def solution(n):
    n_list = list(int(i) for i in str(n))
    n_list.reverse()
    return n_list

print(solution(12345))