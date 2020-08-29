# 시간 때문에 다른 사람 풀이 참고...
def solution(n):
    mylist =[1]*(n+1)    #따로 list에 값을 append하는 것이 아니라 소수이면 1이도록 나타내는 list를 만들어 놓고 소수가 아닌것만 0로 바꿔나가자.
    flag = int(n ** 0.5)      # 기준이 되는 flag
    for j in range(2,flag+2):  #이번에는 flag들을 기준으로 하여
        for i in range(0,len(mylist),j):   #flag의 배수들을 소수가 아닌것으로 바꿔나가자
            if i==j:                       #j 와 i 가 같으면 2,3 이런 소수인 애들이므로 바꾸지 않고 계속 for문을 진행
                continue
            mylist[i] = 0                  #아니라면 다 바꿔준다 0은 소수가 아님을 나타내는 값
    mylist[1] = 0                          #1은 소수가 아니므로 인위적으로 0으로 대입해준다 ( 0은 내부 range에서 바뀌므로 제외)
    return mylist.count(1)
solution(10)