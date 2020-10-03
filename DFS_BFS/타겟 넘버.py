"""https://programmers.co.kr/learn/courses/30/lessons/43165"""
# tree

def solution(numbers,target):
    graph = [0]

    for number in numbers:
        node_list = []
        for j in graph:
            node_list.append(j+number)
            node_list.append(j-number)
        graph = node_list

    return graph.count(target)


#dfs

def dfs_solution(numbers,target):
    if not numbers and target == 0:
        return 1
    elif not numbers:
        return 0
    else:
        return dfs_solution(numbers[1:],target-numbers[0]) + dfs_solution(numbers[1:],target+numbers[0])

#dfs
def dfs(nums, i, n, t):
    ret = 0
    if i==len(nums):
        if n==t: return 1
        else: return 0
    ret += dfs(nums, i+1, n+nums[i], t)
    ret += dfs(nums, i+1, n-nums[i], t)
    return ret

def dfs_solution_2(numbers, target):
    answer = dfs(numbers, 0, 0, target)
    return answer


print(solution([1,1,1,1,1],3))
print(dfs_solution([1,1,1,1,1],3))
print(dfs_solution_2([1,1,1,1,1],3))