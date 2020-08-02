def solution(s):
    answer = True
    if len(s)==4 or len(s)==6:
        answer = s.isdigit()
    else:
        answer = False
    
    return answer


print(solution("12349"))
        
