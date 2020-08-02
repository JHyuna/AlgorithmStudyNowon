def solution(a,b):
    m_list =[31,29,31,30,31,30,31,31,30,31,30,31]
    d_list =['THU','FRI','SAT','SUN','MON','TUE','WED']
    day = (sum(m_list[0:a-1])+b)%7

    answer = d_list[day]

    return answer

print(solution(5,24))