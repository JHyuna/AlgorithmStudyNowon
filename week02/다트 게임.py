def solution(dartResult):
    score_list =[]
    result =[]

    dartResult = dartResult.replace('10','X')
    score_list=['10' if i == 'X' else i for i in dartResult]

    xx_list = ['S','D','T']

    for i in score_list:
        if i in xx_list:
            result[-1] = result[-1] ** (xx_list.index(i)+1)
        elif i == "*":
            if len(result) == 1:
                result[-1] *= 2
            else:
                result[-1] *= 2
                result[-2] *= 2
        elif i == '#':
            result[-1] *= -1 

        else:
            result.append(int(i))


    return sum(result)


print(solution("10D10S#10S"))
print(solution("1S*2D*3T"))



            

        
