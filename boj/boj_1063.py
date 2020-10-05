"""https://www.acmicpc.net/problem/1063"""

"""킹"""

direction = {'T':1, 'B':-1, 'R':1, 'L':-1}


def King():
    king_place, stone_place, move_num = map(str,input().split())
    move_list = [input() for _ in range(int(move_num))]
    king_place, stone_place = Change_easy(king_place,stone_place)

    for m in move_list:
        
        k_tmp = list(king_place)   ###
        s_tmp = list(stone_place)
        
        for i in range(len(m)):
            if m[i] == 'T' or m[i] == 'B':
                k_tmp[1] += direction[m[i]]
            else:
                k_tmp[0] += direction[m[i]]
        
        if k_tmp == s_tmp:
            for i in range(len(m)):
                if m[i] == 'T' or m[i] == 'B':
                    s_tmp[1] += direction[m[i]]
                else:
                    s_tmp[0] += direction[m[i]]
            
        if Check_in(k_tmp,s_tmp):
            king_place = k_tmp
            stone_place = s_tmp
            

    return king_place,stone_place


def Check_in(kp,sp):
    if 1 <= kp[1] <= 8 and 65 <= kp[0] <= 72 and 1 <= sp[1] <= 8 and 65 <= sp[0] <= 72:
        return True
    else:
        return False

def Change_easy(king_place,stone_place):
    kp = []
    sp = []
    kp.append(ord(king_place[0]))
    kp.append(int(king_place[1]))
    sp.append(ord(stone_place[0]))
    sp.append(int(stone_place[1]))    
    return kp,sp




king_fin, stone_fin = King()


for i in range(2):
    if i == 0:
        king_fin[i] = chr(king_fin[i])
        stone_fin[i] = chr(stone_fin[i])
    else:
        king_fin[i] = str(king_fin[i])
        stone_fin[i] = str(stone_fin[i])

king_fin = ''.join(king_fin)
stone_fin = ''.join(stone_fin)


print(king_fin)
print(stone_fin)
