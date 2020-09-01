def solution(n):
    n_sum = 0
    while n > 0:
        n_sum += n%10
        n = n//10

    return n_sum

print(solution(987))

"""
def sum_digit(number):
    return sum(map(int,str(number)))

def sum_digit(number):
    return sum([int(i) for i in str(number)])

"""