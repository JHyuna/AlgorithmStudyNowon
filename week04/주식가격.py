"""https://programmers.co.kr/learn/courses/30/lessons/42584"""

def solution(prices):
    """
    
    time_cnt =[0]*len(prices)
    
    for i in range(len(prices)-1):
        for j in range(i+1,len(prices)):
            time_cnt[i] += 1
            if prices[i] > prices[j]:
                break
    """
    
    time_cnt = [0] * len(prices)
    stack = [0]
    for i in range(1, len(prices)):
        if prices[i] < prices[stack[-1]]:
# 이때 queue를 쓰지 않고 stack을 써서 역으로 index를 검사하는 이유는 stack 내 뒤쪽 것이 
# p[i]보다 가격이 같거나 작다면, 그 앞의 것들은 i index에서 최초로 가격이 떨어질리 없기에 굳이 검사하지 않고 
# break로 시간을 줄일 수 있기 때문입니다.
            for j in stack[::-1]:     
                #print(stack)
                if prices[i] < prices[j]:
                    time_cnt[j] = i-j 
                    stack.remove(j)
                else:
                    break
        stack.append(i)
    print(stack)
    for i in range(0, len(stack)-1):
        print(time_cnt)
        print(i)
        print(stack[i])
        time_cnt[stack[i]] = len(prices) - stack[i] - 1            

    return time_cnt
    
print(solution([1,2,3,2,3]))

