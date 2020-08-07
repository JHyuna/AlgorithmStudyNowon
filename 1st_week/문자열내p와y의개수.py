def solution(s):
    count_yY = s.count('y')+s.count('Y')
    count_pP = s.count('p')+s.count('P')
    if count_yY == count_pP:
        return True
    else:
        return False
solution('pPoooyY')