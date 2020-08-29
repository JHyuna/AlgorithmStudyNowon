def solution(a, b):
    # 달과 일에 대한 list 생성
    month = [31,29,31,30,31,30,31,31,30,31,30,31]
    date = ["FRI", "SAT", "SUN","MON", "TUE", "WED","THU"]
    days = 0
    # 1월이 아니면 앞의 달들에 대한 일수를 더해줘야하므로 분기점은 a = 1이 됨
    if a>1:
        # 1월이 아닐 때, 앞의 달들에 대한 일들을 month[i]로 받아와서 모두 합해줌
        for i in range(0,a-1):
            days += month[i]
            # 월에 대한 일들과 주어진 b일을 합한게 sum_day
            sum_day = days + b

    else:
        # 1월이면 그냥 b일만 계산하면 됨
        sum_day = b
    return date[sum_day%7-1] # sum_day를 7로 나누고 -1을 해야 1/1일이 fri였던 것에 기준을 맞출 수 있게됨

solution(5,24)