# n**0.5는 항상 float로 나오기 때문에, int로 변환한 형태와 원본이 같다고 하고 비교해야 정확함
def solution(n):
    return (n**0.5 +1)**2 if (n**0.5) == int(n**0.5) else -1

solution(121)