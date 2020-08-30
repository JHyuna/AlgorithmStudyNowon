def solution(bridge_length, weight, truck_weights):
    time=0
    line=[0]*bridge_length # line리스트에 다리길이만큼 0을 선언해준다. (이 리스트가 다리의 상황을 나타내줄것임)
    current_lines=0 #값을 하나씩빼주면서, 가능한 무게의 트럭을 담는다. (line이 빌때까지)
    # 리스트에 값을 빼주고 더하면서 time을 더해주는 방식은 트럭이 다리를 움직이는 과정이다.
    #
    #          그래서 리스트를 뽑아보면 반복문이 실행할때마다 트럭이 점점 오른쪽으로 움직이며 마지막엔
    #
    #          빠져나가는 것을 볼 수 있다.

    # 다리가버틸수있는 무게를 초과할 경우는 그냥 0을 담고 빼면서 트럭을 움직인다.
    # 담을 수 있는 트럭이 하나도 안남을 경우, pop()하는 과정만 반복한다.(마지막 트럭의 경우)
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