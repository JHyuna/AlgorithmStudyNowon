def solution(n):
    output =[]
    for a in range(0,n):
        if a%2 == 0:
            output.insert(a,'수')
        else:
            output.insert(a,'박')
    return "".join(output)
solution(3)