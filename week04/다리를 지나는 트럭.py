"""https://programmers.co.kr/learn/courses/30/lessons/42583"""

def solution(bridge_length, weight, truck_weights):
    time = bridge_length    #마지막 차가 다리를 빠져 나갈때까지 시간 bridge_length
    bridge = [0]*bridge_length
    bridge_weight = 0

    while truck_weights:
        time += 1
        bridge_weight -= bridge.pop(0)
        if bridge_weight + truck_weights[0] > weight:
            bridge.append(0)
        else:
            w = truck_weights.pop(0)
            bridge_weight += w
            bridge.append(w)
            





    return time


print(solution(2,10,[7,4,5,6]))
print(solution(100, 100, [10]))

            
            


            




            






