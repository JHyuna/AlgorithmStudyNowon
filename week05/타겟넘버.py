def solution(numbers, target):
    length = len(numbers)
    count = 0

    def dfs(level, total):
        if level == length:
            if total == target:
                nonlocal count
                count += 1
        else:
            dfs(level + 1, total + numbers[level])
            dfs(level + 1, total - numbers[level])

    dfs(0, 0)
    return count