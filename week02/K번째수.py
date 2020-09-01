"https://programmers.co.kr/learn/courses/30/lessons/42748"

def solution(array,commands):
    result =[]

    for i in commands:

        tmp_list = []
        tmp_list=array[i[0]-1:i[1]]
        tmp_list.sort()
        result.append(tmp_list[i[2]-1])
        
        #result.append(sorted(array[i[0]-1:i[1]])[i[2]-1])

    return result

print(solution([1,2,3,4,5,6,7],[[2,4,3],[1,3,2]]))