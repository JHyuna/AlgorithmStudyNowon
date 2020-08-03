def solution(x):
    answer = False
    ans = 0
    rest = []
    y = x

    while y >= 10:
        r = y%10
        print(r)
        rest.append(int(r))
        y = int(y/10)

    for i in range(len(rest)):
        ans += rest[i]

    ans += y
    if x%ans == 0:
        answer = True 

    return answer