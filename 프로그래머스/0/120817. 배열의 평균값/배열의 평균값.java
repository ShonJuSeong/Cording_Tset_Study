class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int num : numbers){answer += num;}
                
        return answer / numbers.length;
    }
}

//-----------------------------------------------------------------------------------
import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
//-----------------------------------------------------------------------------------
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        answer /= numbers.length;
        //answer = answer / numbers.lengrh;
        return answer;
    }
}


//복합 대입 연산자 
//for문 // for each
