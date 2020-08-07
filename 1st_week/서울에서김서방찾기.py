# pandas에서 하던거라 index함수 사용
def solution(seoul):
    index = seoul.index('Kim')
    answer = '김서방은 {}에 있다'.format(index)
    return answer

solution(['Jane', 'Kim'])