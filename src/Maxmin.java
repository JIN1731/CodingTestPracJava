import java.util.ArrayList;
import java.util.List;

public class Maxmin {

    public static void main(String[] args) {

        int[] arr = {10,1,1,3,3,0,1,1};

       List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i=0; i<arr.length; i++){
            if(i>0 && arr[i]!=arr[i-1]){
                System.out.println(arr[i]);
                answer.add(arr[i]);
            }


        }
//        if(arr[arr.length-1]!= arr[arr.length-2]){
//            answer.add(arr[arr.length-1]);
//        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//        System.out.println(arr[0]);

        System.out.println(answer);

        int n=15;
        int m= 45;
       List<Integer> nmax = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(n%i==0){
                nmax.add(i);
            }
        }

        List<Integer> mmax = new ArrayList<>();

        for(int i=1; i<=m; i++){
            if(m%i==0){
                mmax.add(i);
            }
        }
        int max=0;
        for(int nm : nmax){
            for(int mm : mmax){
                if(nm==mm){
                    max = nm;
                }
            }
        }

            int large = Math.max(n, m);
            int small = Math.min(n,m);
            int min = 0;
        for(int i = 1; i<=n; i++){
            if(large*i%small==0){
                min = large*i;
                break;
            }
        }
    }
}