# 맞은 풀이
import string

def solution(s, n):
    lower = list(string.ascii_lowercase)
    upper = list(string.ascii_uppercase)
    s = list(s)
    for i, alpha in enumerate(s):
        if alpha in lower:
            index = (lower.index(alpha) + n) % 26
            s[i] = lower[index]
        elif alpha in upper:
            index = (upper.index(alpha) + n) % 26
            s[i] = upper[index]
        else:
            pass
    return ''.join(s)

solution('AB',1)