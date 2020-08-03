def solution(s):
    charlist = ""
    idx = 0
    for i in s:
        if i.isalpha():
            if idx%2 == 0:
                idx += 1
                charlist += i.upper()
            else:
                idx += 1
                charlist += i.lower()
        else:
            idx = 0
            charlist += ' '
            continue
    return charlist