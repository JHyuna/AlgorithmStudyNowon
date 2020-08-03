def solution(a):
    length = len(a)
    
    if length % 2 != 0:
        index = (int)(length/2)
        return a[index]

    else:
        index = (int)(length/2)
        result = a[index-1:index+1]
        return result