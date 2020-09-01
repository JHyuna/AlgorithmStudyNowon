"""https://programmers.co.kr/learn/courses/30/lessons/42579"""

def solution(genres, plays):
    hash_map = {    }
    #속한 노래가 많이 재생된 장르  -> 장르 내에 많이 재생 -> 고유번호가 낮은 노래

    for i in range(len(genres)):
        if genres[i] not in hash_map:

            hash_map[genres[i]] = [(i,plays[i])]

        else:

            hash_map[genres[i]].append((i,plays[i]))

    genres_dict = {}
    for i in range(len(genres)):
        if genres[i] not in genres_dict:

            genres_dict[genres[i]] = plays[i]
        
        else:

            genres_dict[genres[i]] += plays[i]

    #print(genres_dict)

    a = list(genres_dict.items())

    a.sort(key= lambda x: -x[1])
    

    result = [ ]
    for i in hash_map:
        hash_map[i].sort(key=lambda x:-x[1])
    #print(hash_map)
    for i,_ in a:
        if len(hash_map[i]) == 1:
            result.append(hash_map[i][0][0])
        else:
            for j in range(2):
                result.append(hash_map[i][j][0])
            
    return result

print(solution(["pop","classic",  "classic", "classic", "pop"], [500, 6000, 150, 800, 2500]))