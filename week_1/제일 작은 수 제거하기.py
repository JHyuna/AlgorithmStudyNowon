def solution(arr):
    arr.remove(min(arr))
    if not arr:
        arr.append(-1)
        return arr
    return arr

print(solution([1]))