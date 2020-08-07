def solution(strings, n):
    answer = []
    for strs in strings:
        # 우선 알파벳 순서로 정렬을 먼저 해놓고 sorted(strings)
        # 그 다음에 원래 했던 대로 [n] 인덱스 정렬 해버리면 끝
        answer = sorted(sorted(strings), key=lambda strs: strs[n])
    return answer
solution(['abce', 'abcd', 'cdx'], 2)