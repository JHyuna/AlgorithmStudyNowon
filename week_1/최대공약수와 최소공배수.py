def solution(n,m):
    b = max(n,m)
    s = min(n,m)
    gcd = 0
    lcm = 0
    for i in range(1,s+1):
        if s % i == 0 and b % i == 0:
            gcd = i
    for i in range(b*s,b-1,-1):
        if i % s == 0 and i % b == 0:
            lcm = i
    answer = [gcd,lcm]
    return answer

print(solution(3,12))

"""
def gcdlcm(a, b):
    c, d = max(a, b), min(a, b)
    t = 1
    while t > 0:
        t = c % d
        c, d = d, t
    answer = [c, int(a*b/c)]

    return answer
"""

