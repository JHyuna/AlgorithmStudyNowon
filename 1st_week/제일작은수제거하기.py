# 더 줄여서 return 에 한번에 쓰고 싶은데 반영이 안됨...추가 고찰 필요
def solution(arr):
    arr.remove(min(arr))
    return arr if len(arr) != 0 else [-1]

solution([10])