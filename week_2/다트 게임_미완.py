def solution(dartResult):
    
    score_list = list(dartResult)

    result = []

    for i in range(len(score_list)):
        if score_list[i] >= '0' and score_list[i] <= '10':
            #print("go")
            if score_list[i+1] == 'D':
                result.append(int(score_list[i])**2)
                i += 1
            elif score_list[i+1] == 'T':
                result.append(int(score_list[i])**3)
                i += 1
            else:
                result.append(int(score_list[i]))
                i += 1
            print(result)
        elif score_list[i] == '*':
            if len(result) ==1 :
                result[0] *= 2 
            else:
                for j in range(len(result)-1,len(result)-3,-1):
                    result[j] *= 2

        elif score_list[i] == '#':
            result[-1] *= -1


                


             


    return sum(result)


print(solution("1D2S#10S"))



            

        
