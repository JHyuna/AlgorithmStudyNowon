"""https://programmers.co.kr/learn/courses/30/lessons/42577"""
"""
def solution(phone_book):
    answer = True 
    phone_book.sort()
    print(phone_book)
    for i in range(len(phone_book)-1): 
        if phone_book[i] in phone_book[i+1]: 
            answer = False 
            break 
        
    return answer
                
"""
def solution(phone_book):
    answer = True
    hash_map = {}
    for phone_number in phone_book:
        hash_map[phone_number] = 0
    print(hash_map)
    for phone_number in phone_book:
        temp = ""
        for number in phone_number:
            temp += number
            print(temp)
            if temp in hash_map and temp != phone_number:
                answer = False
    return answer




print(solution(["119", "97674223", "1195524421"]))
    
