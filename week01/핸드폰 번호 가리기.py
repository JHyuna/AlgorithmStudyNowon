def solution(n):
    n_list = list(n)
    for i in range(len(n_list)-4):
        n_list[i] = '*'
    n = ''.join(n_list)

    return n

'''

def hide_numbers(s):
    return "*"*(len(s)-4) + s[-4:]
'''


print(solution('01091546334'))