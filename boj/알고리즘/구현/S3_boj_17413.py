"""https://www.acmicpc.net/problem/17413"""


"""단어 뒤집기 2"""

##정규식의 사용???

from collections import deque

input_str_list = deque(list(map(str,input())))
result_str = ''


#print(input_str_list)

while input_str_list:

    tc = input_str_list[0]
    #print(tc)

    tag = ''
    word = deque([])

    if tc == "<":
        while True:
            if input_str_list[0] == ">":
                tag += input_str_list.popleft()
                break
            else:
                tag += input_str_list.popleft()

        result_str += tag

    elif tc == ' ':
        result_str += input_str_list.popleft()

    else:

        while True:
            if not input_str_list:
                break

            else:
                if input_str_list[0] == ' ':
                    break
                elif input_str_list[0] == '<':
                    break
                else:
                    word.appendleft(input_str_list.popleft())

        for i in range(len(word)):
            result_str += word[i]



            
    #print(input_str_list)


print(result_str)