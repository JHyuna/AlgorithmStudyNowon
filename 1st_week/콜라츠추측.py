# 첫번째 코드 : 맞는 거 같지만 너무 긴듯
def solution(num):
    i = 0
    while num != 1:
        if num % 2 == 0:
            num = num / 2
            i += 1
        else:
            num = num * 3 + 1
            i += 1
    return i if i < 500 else -1


solution(626331)


# 두번째 코드 : 조건문 정리해서 좀 더 간결하게 짜기
def solution(num):
    i = 0
    while num != 1:
        num = num / 2 if num % 2 == 0 else num * 3 + 1
        i += 1
    return i if i < 500 else -1


solution(6)