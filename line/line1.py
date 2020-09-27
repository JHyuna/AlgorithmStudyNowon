def solution(boxes):
    result = []
    boxes_num = len(boxes)
    count = 0
    for i in boxes:
        for j in i:
            if j in result:
                result.remove(j)
                count += 1
            else:
                result.append(j)

    answer = boxes_num - count

    return answer




print(solution([[1, 2], [2, 1], [3, 3], [4, 5], [5, 6], [7, 8]]	))

