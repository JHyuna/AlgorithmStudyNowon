# len으로 뒷 4자리만 빼고 *로 바꾸면 됨
def solution(n):
    return n.replace(n[:len(n)-4], '*'*(len(n)-4))
solution('027778888')  