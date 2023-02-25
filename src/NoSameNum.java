import java.util.ArrayList;
import java.util.List;

public class NoSameNum {

        public List<Integer> solution(int []arr) {
            List<Integer> answer = new ArrayList<>();
            answer.add(arr[0]);

            for(int i=0; i<arr.length; i++){
                if(i>0 && arr[i]!=arr[i-1]){
                    answer.add(arr[i]);
                }


            }
            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

            return answer;
        }
}
