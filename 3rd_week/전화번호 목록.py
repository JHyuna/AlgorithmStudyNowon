# if using .sort() function, U can get a list that begins with the same character.
# only have to do is comparing 'the element' with the next element.
def solution(phone_book):
    phone_book.sort()
    for i in range(len(phone_book) - 1):
        if phone_book[i] in phone_book[i+1]:
            return False
    return True