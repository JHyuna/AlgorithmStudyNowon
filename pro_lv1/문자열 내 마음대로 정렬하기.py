def solution(strings,n):
    lar = list()
    for i in range(len(strings)):
        lar.append(strings[i][n]+strings[i])
    lar.sort()
    
    for i in range(len(lar)):
        lar[i] = lar[i][1:]
    return lar

        