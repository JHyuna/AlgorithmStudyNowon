# 리스트컴프리헨션으로 좌표 생성 -> 효율 떨어지니 포기
#def solution(W,H):
#    LIST = [ (x,y) for x in range(W+1) for y in range(H+1)]
#    height = []
#    for (x,y) in LIST:
#        (a,b) = (0,H)
#        (c,d) = (W,0)
#        f = ((d-b)/(c-a))(x-a)+b
#    return

# -------- 아래가 제출 답안 ---------

# 로그함수, 지수함수 문제에서 풀던 단위정사각형 문제 기억남
# 지나는 단위 정사각형 개수
# - 사각형이 정사각형이면 (가로길이)
# - 사각형이 직사각형이면 (가로 + 세로 - 최대공약수)
# 가로*세로 - 지나는 단위 정사각형 개수
from math import gcd
from math import gcd
def solution(w,h):
    passed_square = w + h - gcd(w,h)
    return w * h - passed_square