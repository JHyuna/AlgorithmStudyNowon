"""https://programmers.co.kr/learn/courses/30/lessons/43164"""

def solution(tickets):
    routes = dict()

    for (start, end) in tickets:
        routes[start] = routes.get(start, []) + [end]  
    print(routes)
    #시작점 - [끝점] 역순으로 정렬    
    for r in routes.keys():
        routes[r].sort(reverse=True)
    print(routes)
    # 3. DFS 알고리즘으로 path를 만들어줌.
    st = ["ICN"]
    path = []
    
    while st:
        top = st[-1]

        if top not in routes or len(routes[top]) == 0:
            path.append(st.pop())
        else:
            st.append(routes[top][-1])
            routes[top] = routes[top][:-1]
    
    # 4. 만든 path를 거꾸로 돌림.
    answer = path[::-1]
    return answer

#print(solution([["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]]))
print(solution([["ATL", "ICN"],["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL","SFO"]]))