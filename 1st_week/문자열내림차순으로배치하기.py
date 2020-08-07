# sorted하는 순간 문자열이 리스트로 변환되어서..join기능은 검색해봄
def solution(s):
    answer = "".join(sorted(s, reverse=True))
    return answer
solution('bZZAgcedf')