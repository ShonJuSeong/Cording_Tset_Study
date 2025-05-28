def solution(s):
    answer = 0
    for i in range(len(s)):
        tmp_s = s[i:] + s[:i]
        while True:
            before = tmp_s
            tmp_s = tmp_s.replace("()", "").replace("{}", "").replace("[]", "")
            if before == tmp_s:  
                break
        if tmp_s == "":
            answer += 1
    return answer