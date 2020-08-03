def solution(n):
    answer = 0
    lar = list()

    while n >= 10:
        lar.append(n%10)
        n = int(n/10)
    lar.append(n)
    for i in range(len(lar)):
        answer += lar[i]
    return answer