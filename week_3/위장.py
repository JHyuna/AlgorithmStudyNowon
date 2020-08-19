def solution(clothes):

    hash_map ={}

    for _,i in clothes:
        if i in hash_map.keys():
            hash_map[i] += 1
        else:
            hash_map[i] = 1
    #print(hash_map)
    answer = 1
    
    for i in hash_map.values():
        answer *= i+1
        
    answer -= 1
    return answer




print(solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]))

print(solution([["crow_mask", "face"], ["blue_sunglasses", "face"], ["smoky_makeup", "face"]]))

