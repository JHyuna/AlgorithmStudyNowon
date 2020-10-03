def solution(ball,order):
    result = []

    tmp_list = [] # 대기 리스트

    for i in order[:]:
        #print(i)
        while True:  # 대기 리스트에서 빼낼 수 있는 공이 있는지 확인 
                    # 대기 리스트에 공이 여러개 일 수 있으므로 while
            if ball[0] in tmp_list:
                result.append(ball[0])
                tmp_list.remove(ball[0])
                ball.pop(0)  


            elif ball[-1] in tmp_list:
                result.append(ball[-1])
                tmp_list.remove(ball[-1])x
                ball.pop(-1)
            
            else:
                break
        
        if i == ball[0]:    # 대기 리스트에서  빼낼 공이 없으면 
            ball.pop(0)
            result.append(i)
        elif i == ball[-1]:  
            ball.pop()
            result.append(i)
        else:
            tmp_list.append(i)

    
    """
        print(ball)
        print(tmp_list)
        print(result)
        print()
    """
    return result


print(solution([1, 2, 3, 4, 5, 6],[6, 2, 5, 1, 4, 3]	))
print(solution([11, 2, 9, 13, 24],[9, 2, 13, 24, 11]	))



