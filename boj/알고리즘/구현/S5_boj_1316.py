"""https://www.acmicpc.net/problem/1316"""


"""그룹 단어 체커"""


N = int(input())
w_list = []

for i in range(N):
    tmp = []
    word = input()
    tmp.extend(word)
    w_list.append(tmp)


cnt = N

for word in w_list:
    alph_list = []
    for i in range(len(word)):
        if word[i] not in alph_list:
            alph_list.append(word[i])
        else:
            if word[i-1] == word[i]:
                continue
            else:
                cnt -= 1
                break
    
print(cnt)
        
            

