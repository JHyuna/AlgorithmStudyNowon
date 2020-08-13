"""https://programmers.co.kr/learn/courses/30/lessons/17681"""


def solution(n,arr1,arr2):
    f_result =['#'*n]*n
    for i in range(n):
        a = cvt_bin(n,arr1[i])
        b = cvt_bin(n,arr2[i])
        k = list(f_result[i])
        for j in range(n):
            if a[j] == 0 and b[j] == 0:
                k[j] = ' '
                f_result[i] = ''.join(k)
            else:
                continue

    return f_result

def cvt_bin(n,m):
    result =[0]*n
    for i in range(n):
        tmp = m%2
        m = m//2
        result[n-1-i] = tmp
    
    return result 

print(solution(5,[9, 20, 28, 18, 11],[30, 1, 21, 17, 28]))