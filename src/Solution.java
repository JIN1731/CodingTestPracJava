import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

//        int[] arr = {10,1,1,3,3,0,1,1};
//
//       List<Integer> answer = new ArrayList<>();
//        answer.add(arr[0]);
//
//        for(int i=0; i<arr.length; i++){
//            if(i>0 && arr[i]!=arr[i-1]){
//                System.out.println(arr[i]);
//                answer.add(arr[i]);
//            }
//
//
//        }
////        if(arr[arr.length-1]!= arr[arr.length-2]){
////            answer.add(arr[arr.length-1]);
////        }
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
////        System.out.println(arr[0]);
//
//        System.out.println(answer);

//        int n=15;
//        int m= 45;
//       List<Integer> nmax = new ArrayList<>();
//
//        for(int i=1; i<=n; i++){
//            if(n%i==0){
//                nmax.add(i);
//            }
//        }
//
//        List<Integer> mmax = new ArrayList<>();
//
//        for(int i=1; i<=m; i++){
//            if(m%i==0){
//                mmax.add(i);
//            }
//        }
//        int max=0;
//        for(int nm : nmax){
//            for(int mm : mmax){
//                if(nm==mm){
//                    max = nm;
//                }
//            }
//        }
//
//            int large = Math.max(n, m);
//            int small = Math.min(n,m);
//            int min = 0;
//        for(int i = 1; i<=n; i++){
//            if(large*i%small==0){
//                min = large*i;
//                break;
//            }
//        }
        List<Integer> answer = new ArrayList<>();
        String today = "2020.01.01";
        String[] terms = {"Z 1", "D 4", "A 100"};
        String[] privacies = {"2019.09.01 A", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2019.12.28 Z"};
//        System.out.println(privacies[0].charAt(11));
//        terms[0].charAt(0);

        for (String t : terms) {
            for (int i = 0; i<privacies.length; i++) {
                if (t.charAt(0) == privacies[i].charAt(11)) {
                    System.out.println(privacies[i]);
                    int add = Integer.parseInt(t.substring(2));
                    System.out.println(add);
                    int mon = Integer.parseInt(privacies[i].substring(5, 7));
                    System.out.println(mon);
                    int month = 0;
                    int year = Integer.parseInt(privacies[i].substring(0, 4));
                    month = add + mon;
                    System.out.println(month);
                    while(month>12){
                        month = month - 12;
                        year++;
                    }

                    System.out.println(month);

//                   int thisyear = Integer.parseInt(today.substring(0,3));
//                   int thismonth = Integer.parseInt(today.substring(5,6));
//                   int thisday = Integer.parseInt(today.substring())

                    String to = today.replace(".", "");
//                    System.out.println(to);
                    System.out.println(new DecimalFormat("00").format(month));
                    String pri = "" + year + new DecimalFormat("00").format(month) + privacies[i].substring(8, 10);
                    int compare = Integer.parseInt(pri);
                    System.out.println(compare);
                    int thisday = Integer.parseInt(to);
                    System.out.println(thisday);
                    if (thisday >= compare) {
                        answer.add(i+1);
                        Collections.sort(answer);
                        System.out.println(answer);
                    }

                }

            }

        }

    }
}