# dictionary X 만드는 과정이 다소 비효율적..
from collections import defaultdict

X = defaultdict(list)
def solution(clothes):
    answer = 1
    for value,key in dict(clothes).items():
        X[key].append(value)
    for key in X.keys():
        answer = answer * (len(X[key]) + 1)
    return answer - 1