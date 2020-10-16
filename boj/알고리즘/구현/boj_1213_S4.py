"""https://www.acmicpc.net/problem/1213"""

"""팰린드롬 만들기"""



hash_map = {}

name = input()


#####
for i in range(len(name)):
    if name[i] not in hash_map:
        hash_map[name[i]] = 1
    else:
        hash_map[name[i]] += 1

value_list = list(hash_map.values())
key_list = sorted(hash_map.keys())
#print(key_list)
####



def Pre_condition():
    cnt = 0
    if len(name) % 2 == 0:
        for i in value_list:
            if i%2 == 0:
                cnt += 1
            else:
                continue
        if cnt == len(value_list):
            return 1
        else:
            return False
            
            
    else:
        for i in value_list:
            if i%2 == 1:
                cnt += 1
            else:
                continue
        if cnt == 1:
            return 2
        else:
            return False
        

def solution():
    result = []
    if Pre_condition() == 1 :
        for key,value in hash_map.items():
            hash_map[key] = value//2
        for i in key_list:
            while True:
                if hash_map[i] ==0:
                    break
                result.append(i)
                hash_map[i] -= 1
        
        result_2 = reversed(result)
        result.extend(result_2)
        return ''.join(result)

    elif Pre_condition() == 2:
        for key,value in hash_map.items():
            if value %2 == 0:
                hash_map[key] = value//2
            else:
                k = key
                hash_map[key] = value//2

        for i in key_list:
            while True:
                if hash_map[i] ==0:
                    break
                result.append(i)
                hash_map[i] -= 1
        result_2 = reversed(result)
        result.append(k)
        result.extend(result_2)
        return ''.join(result)
                
        
    else:
        return "I'm Sorry Hansoo"


print(solution())

"""

names = input()
name_cnt = [0 for _ in range(26)]
for name in names:
    name_cnt[ord(name)-65] += 1

odd = 0
odd_alpha = ''
alpha = ''

for i in range(26):
    if name_cnt[i] % 2 == 1:
        odd += 1
        odd_alpha += chr(i+65)
    alpha += chr(i+65) * (name_cnt[i] // 2)

if odd > 1 :
    print("I'm Sorrty Hansoo")
else:
    print(alpha + odd_alpha + alpha[::-1])

"""