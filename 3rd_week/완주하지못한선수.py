# set 함수로 중복치 처리 하는 방법 추가로 생각해보기

# 통과한 코드
def solution(participant, completion):
    P,C = Counter(participant),Counter(completion)
    answer = [key for key,value in P.items() if P[key]!=C[key]]
    return answer[0]