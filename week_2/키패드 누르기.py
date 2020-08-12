def solution(numbers,hand):
    result = []
    l_f = 10
    r_f = 12
    for i in numbers:
        if i == 0:
            i = 11
        if i % 3 == 1:
            result.append("L")
            l_f = i
        elif i % 3 == 0:
            result.append("R")
            r_f = i
        elif i % 3 == 2:
            k = LorR(i,r_f,l_f,hand)
            result.append(k)
            if k == "L":
                l_f = i
            else:
                r_f = i
                

    return "".join(result)

def LorR(i,r_f,l_f,hand):
    r_cnt = 0
    l_cnt = 0

    if r_f % 3 == 0:
        r_f -= 1
        r_cnt += 1
        r_cnt += abs(r_f - i)//3
    else:
        r_cnt += abs(r_f - i)//3
        
    if l_f % 3 == 1:
        l_f += 1
        l_cnt += 1
        l_cnt += abs(l_f - i)//3
    else:
        l_cnt += abs(l_f - i)//3
       
    if r_cnt > l_cnt:
        return "L"
    elif r_cnt < l_cnt:
        return "R"
    else:
        return hand[0].upper()



print(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5],"right"))
print(solution([7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2],"left"	))

        
