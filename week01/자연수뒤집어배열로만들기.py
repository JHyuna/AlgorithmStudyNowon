# map 안에서 미리 reversed로 해버리면 요소들이 str로 바뀌므로 비추함
def solution(n):
    return list(map(int, list(str(n))))[::-1]
solution(12345)