# test 13에서 런타임에러 발생...
def solution(x,n):
    return [i for i in range(x,x*n+1,x)] if x>0 else [i for i in range(x,x*n-1,x)]
solution(2,5)

# 속도는 코드2가 빠른데 얘는 무사히 통과
def solution(x, n):
    return [i * x + x for i in range(n)]
solution(2,5)