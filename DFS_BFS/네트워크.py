"""https://programmers.co.kr/learn/courses/30/lessons/43162"""
def dfs(k, graph, visited):   # recursive dfs
    visited[k] = 1         # 방문한 컴퓨터번호 1로 변경
    for i in range(len(graph[k])):     # 해당 컴퓨터와 연결되어 있고 방문한 적이 없는 컴퓨터 확인
        if visited[i] == 0 and graph[k][i] == 1:
            dfs(i, graph, visited)      # 연결되어있고 방문 하지 않았으면

def solution(n, computers):

    visited = [0] * n

    answer = 0

    for i in range(n):
        if visited[i] == 0:
            dfs(i, computers, visited)
            answer += 1                # 네트워크수 +

    return answer

print(solution(3,[[1, 1, 0], [1, 1, 0], [0, 0, 1]]))