# if you using set function for list, the overlapped element can be the problem.
from collections import Counter
def solution(participant, completion):
    P,C = Counter(participant),Counter(completion)
    answer = [key for key,value in P.items() if P[key]!=C[key]]
    return answer[0]