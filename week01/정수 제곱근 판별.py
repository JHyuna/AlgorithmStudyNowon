import math
def solution(n):
    if math.sqrt(n).is_integer():
        return int((math.sqrt(n)+1)**2)
    else:
        return -1


print(solution(121))

"""
def nextSqure(n):
    sqrt = n ** (1/2)

    if sqrt % 1 == 0:
        return (sqrt + 1) ** 2
    return 'no'
"""