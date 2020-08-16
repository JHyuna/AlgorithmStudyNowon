"""https://programmers.co.kr/learn/courses/30/lessons/42579"""

from typing import List, Dict, Tuple
from collections import defaultdict


def solution(genres: List[str], plays: List[int]) -> List[int]:
    genre_count = defaultdict(int)  # type: Dict[str, int]
    melon = defaultdict(list)  # type: Dict[str, List[Tuple[int, int]]]
    for i, genre, play_num in zip(range(len(genres)), genres, plays):
        genre_count[genre] += play_num
        melon[genre].append((i, play_num))

    sorted_genre = sorted(genre_count.items(), key=lambda x: x[1], reverse=True)

    result: List[int] = []
    for genre, _ in sorted_genre:
        melon[genre].sort(key=lambda x: x[1], reverse=True)
        result.extend(map(lambda x: x[0], melon[genre][:2]))
    return result


if __name__ == "__main__":
    assert solution(["classic", "pop", "classic", "classic", "pop"], [500, 600, 150, 800, 2500]) == [4, 1, 3, 0]