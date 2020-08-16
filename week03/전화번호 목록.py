"""https://programmers.co.kr/learn/courses/30/lessons/42577"""

from typing import List


def solution(phone_book: List[str]) -> bool:
    trie = {}
    for phone_number in phone_book:
        current_node = trie
        same_footstep: bool = False
        for c in phone_number:
            if c in current_node:
                same_footstep = True
            else:
                if same_footstep and not current_node:  # 접두어를 가지는 전화번호
                    return False
                same_footstep = False
                current_node[c] = {}
            current_node = current_node[c]
        if same_footstep:  # 접두어인 전화번호
            return False
    return True


if __name__ == "__main__":
    assert solution(["119", "97674223", "1195524421"]) is False
    assert solution(["123", "456", "789"]) is True
    assert solution(["12", "123", "1235", "567", "88"]) is False
    assert solution(["1235", "1234", "789"]) is True
