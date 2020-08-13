def solution(p, c):
    p.sort()
    c.sort()
    print(p,c)
    for i in range(len(c)):
        if p[i] != c[i]:
            return p[i]
    return p[-1]
 
    



print(solution(['mislav', 'stanko', 'mislav', 'ana'],['stanko', 'ana', 'mislav']))
print(solution(["leo", "kiki", "eden"], ["eden", "kiki"]))       