class Solution {
    public int solution(String[] s1, String[] s2) {
    int result = 0;
        for(String a :s1){
            for(String b : s2){
                if(a.equals(b))
                result ++;
            }
        }
    return result;   
    }
    
}

import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1));
        // Arrays.asList(s1): 배열인 s1을 리스트로 바꿈.
        // new HashSet<> : 리스트를 HashSet으로 변환 -> 중복없이 빠르게 탐색할 수 있는 구조
        // Set<String> set: s1 : s1안에 있는 문자열을 담은 집합 만듦.
        //set은 contains()을 빠르게 쓸 수 있음. (시간복잡도 ↓)
        return (int)Arrays.stream(s2).filter(set::contains).count();
        // /Arrays.stream(s2) : s2 배열을 stream(데이터 흐름)으로 바꿈. 
        //이제 배열의 값을 하나씩 자동으로 꺼내면서 검사 가능
        //.filter(set::contains)
        //filter: 조건에 맞는 것만 고르기
        //set::contains: 이건 "set 안에 있는가?"를 조건으로 쓰는 것
        //즉, s2의 각 문자열이 s1에 포함되어 있으면 골라내는 것
        // :: -> 메서드 참조 (Method Reference)
    }
}

// contain() 이란? -> rough_note
// stream filter count ->  https://github.com/ShonJuSeong/KB_ITs_JAVA/tree/main/12_JAVA

