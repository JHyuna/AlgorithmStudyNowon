def solution(s):
    output = []
    s = s.split(' ')
    for element in s:
        new=''
        for j in range(0,len(element)):
            new+=element[j].upper() if j%2==0 else element[j].lower()
        output.append(new)
    return ' '.join(output)
solution('try hello world')