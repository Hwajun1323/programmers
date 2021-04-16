import collections

def solution(participant, completion):
    answer = ''
    
    participant.sort()
    completion.sort()
    
    answer = collections.Counter(participant) - collections.Counter(completion)
    return list(answer)[0]
