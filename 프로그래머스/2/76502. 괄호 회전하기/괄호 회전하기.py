1
2
def solution(s):return sum([1 for i in [s[i+1:] + s[:i+1] for i in range(len(s))]