"""https://programmers.co.kr/learn/courses/30/lessons/43163"""


def dfs(begin, words, answer, target):
    if begin == target:
        return answer
    diff = []
    for i in range(len(words)):
        diffCnt = 0
        for j in range(len(begin)):
            if words[i][j] != begin[j]:
                diffCnt += 1
        if diffCnt == 1 and words[i] == target:
            answer.append(words[i])
            return answer
        diff.append(diffCnt)
    print(diff)
    if not 1 in diff:
        return 0
    else:
        next_word = words[diff.index(1)]
        answer.append(next_word)
        words.pop(diff.index(1))
        dfs(next_word, words, answer, target)

def solution(begin, target, words):
    if not target in words:
        return 0
    else:
        answer = []
        dfs(begin, words, answer, target)
        return len(answer)

print(solution("hit","cog",["hot", "dot", "dog", "lot", "log", "cog"]))