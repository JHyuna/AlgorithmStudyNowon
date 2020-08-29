# sort로 정렬하면 같은 문자열로 시작하는 순서대로 정렬되므로 해당 원소 바로 뒷 원소하고만 비교해도됨
def solution(phone_book):
    phone_book.sort()
    for i in range(len(phone_book) - 1):
        if phone_book[i] in phone_book[i+1]:
            return False
    return True