import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Bigger {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>();

        int[] numbers = {9, 1, 5, 3, 6, 2};

//        int[] answer =  new int[numbers.length];
//
//        answer[numbers.length-1] = -1;
//
//        for(int i = 0; i < numbers.length-1; i++){
//            for(int j = 1; i+j < numbers.length; j++) {
//
//                if (numbers[i] > numbers[i + j]) {
//
//                    answer[i] = -1;
//
//                } else if (numbers[i] < numbers[i + j]) {
//                    // 인덱스가 기준 인덱스보다 커야 함.
//                    answer[i] = numbers[i + j];
//                    break;
//                }
//                // 1. 가장 큰 수인 경우 -> -1
//                // 2. 뒤에 어딘가에 큰 수가 존재할 경우 -> 그 수
//                // 3. 마지막 수인 경우
//            }
//        }
//        System.out.println(Arrays.toString(answer));

        // 시간 효율..
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < numbers.length; i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                int index = stack.pop();
                answer[index] = numbers[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = -1;
        }

        return answer;
    }
}
