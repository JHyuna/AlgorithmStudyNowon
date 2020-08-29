# 방향 잘못되서 풀이 참고함
def solution(n, m):
    # list 내포로 n,m의 약수에 대한 리스트 생성
    nn = [i for i in range(1, n + 1) if n % i == 0]
    mm = [i for i in range(1, m + 1) if m % i == 0]

    # 최대공약수는 리스트 nn과 mm에 동시에 속하는 것중 최대
    Max_d = max([i for i in nn if i in mm])
    # 최소공배수는 최대 공약수를 이용해서 구함
    Min_m = Max_d * (n / Max_d) * (m / Max_d)
    answer = [Max_d, Min_m]
    return answer


solution(3, 12)