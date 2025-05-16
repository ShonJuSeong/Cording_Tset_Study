class Solution {
    public int solution(int num1, int num2) {
    double div = ((double)num1 / num2) * 1000;
        return (int)div;
        
    }
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double value = (double)num1 / num2 * 1000;
        //(double)num1: num1을 double 타입으로 강제 형변환
        answer = (int)value;
        return answer;
    }
}
