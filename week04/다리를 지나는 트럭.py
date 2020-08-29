def solution(bridge_length, weight, truck_weights):
    time=0
    line=[0]*bridge_length
    current_lines=0

    while queue:
        time += 1
        current_lines -= line.pop()
        if truck_weights: # 트럭이 빌때까지 뺌

            if truck_weights[0]+current_lines<=weight:
                current_lines+=truck_weights[0]
                line.insert(0,truck_weights.pop(0))

            else:
                line.insert(0,0)
    return time