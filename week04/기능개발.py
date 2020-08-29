# progresses의 각 element를 popleft 사용, 앞에서부터
# 100-progresses.popleft / speeds.popleft -> list에 담기
# 실패한 풀이 -> test case에서 틀리는 경우 발생

from collections import deque
import math
import numpy as np

def solution(progresses, speeds):
    work =[]
    pro, speed = deque(progresses), deque(speeds)
    length = len(pro)
    while length != 0:
        p, s = pro.popleft(), speed.popleft()
        length -= 1
        days = math.ceil((100-p)/s)
        work.append(days)
    work = np.array(work)
    work = [a.tolist() for a in np.split(work, np.where(np.diff(work) > 0)[0]+1)]
    answer = [len(work[i]) for i in range(len(work))]
    return answer

# 수정한 풀이. max값으로 리스트 분할해야 하는 걸 놓쳤었음.
from collections import deque
import math


def solution(progresses, speeds):
    days = []
    answer = []
    pro, speed = deque(progresses), deque(speeds)
    length = len(pro)
    while length != 0:
        p, s = pro.popleft(), speed.popleft()
        length -= 1
        day = math.ceil((100 - p) / s)
        days.append(day)

    for i, e in enumerate(days):
        if i == 0:
            max = e
            answer.append(1)
            continue
        if de<= max:
            answer[-1] += 1
        else:
            max = e
            answer.append(1)
    return answer