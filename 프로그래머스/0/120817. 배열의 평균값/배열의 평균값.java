class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int i : numbers){
            answer += i;}
        return answer/numbers.length;
    }
}

// return Math.sqrt(n) % 1 == 0 ? 1 : 2;
// 이거 한줄로도 가능
