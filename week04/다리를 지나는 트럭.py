def solution(bridge_length, weight, truck_weights):
    time=0
    line=[0]*bridge_length # line리스트에 다리길이만큼 0을 선언해준다. (이 리스트가 다리의 상황을 나타내줄것임)
    current_lines=0 #값을 하나씩빼주면서, 가능한 무게의 트럭을 담는다. (line이 빌때까지)

    while queue:
        time += 1
        current_lines -= line.pop()
        if truck_weights: # 사용 가능한 트럭에 대해서 들어오고 뺌

            if truck_weights[0]+current_lines<=weight:
                current_lines+=truck_weights[0]
                line.insert(0,truck_weights.pop(0))

            else:
                line.insert(0,0)
    return time