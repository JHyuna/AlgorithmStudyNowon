"""
def solution(p, c):
    p.sort()
    c.sort()
    print(p,c)
    for i in range(len(c)):
        if p[i] != c[i]:
            return p[i]
    return p[-1]
"""

def solution(p,c):
    hash_map ={}

    for i in p:
        if i not in hash_map:
            hash_map[i] = 1
        else:
            hash_map[i] += 1

    for i in c:
        hash_map[i] -= 1
    
    a = [key for key,value in hash_map.items() if value == 1]
    
    return a[0]




 
    



print(solution(['mislav', 'stanko', 'mislav', 'ana'],['stanko', 'ana', 'mislav']))
print(solution(["leo", "kiki", "eden"], ["eden", "kiki"]))       