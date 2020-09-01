def solution(arr):
    for i in arr:
        if i == 'Kim':
            #print(arr.index(i))
            break
    s='김서방은 %d에 있다'%arr.index(i)
    return s


print(solution(['d','Kim','dd']))