"""https://programmers.co.kr/learn/courses/30/lessons/42576"""

from typing import List
from collections import Counter


def solution(participant: List[str], completion: List[str]) -> str:
    for result in Counter(participant) - Counter(completion):
        return result


if __name__ == "__main__":
    assert solution(["leo", "kiki", "eden"], ["eden", "kiki"]) == "leo"
    assert solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]) == "vinko"
    assert solution(["mislav", "stanko", "mislav", "ana"], ["stanko", "ana", "mislav"]) == "mislav"
