def solution(s):
    if s.isdigit():
        return int(s)
    else:
        if s[0]=='-':
            return int(s[1:])*-1
        else:
            return int(s[1:]) 
    
print(solution('+1234'))

"""
def strToInt(str):
    result = 0

    for idx, number in enumerate(str[::-1]):
        if number == '-':
            result *= -1
        else:
            result += int(number) * (10 ** idx)

    return result

"""