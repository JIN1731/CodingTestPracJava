import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Keypad {

//    https://school.programmers.co.kr/learn/courses/30/lessons/160586
    public static void main(String[] args) {
//        public int[] solution(String[] keymap, String[] targets) {
        String[] keymap = {"AASDFKASDFASIERWERASDFZ", "BSQERQERDFSGSDFGSS"};
        String[] targets = {"AIOUOYO","BGZ"};
//        int[] answer = {};




//        System.out.println(targets[0].substring(3,4));

//        System.out.println(keymap[1].indexOf(targets[0].substring(3,4)));
        // 있으면 index가 나오고 없으면 -1이 나온다. 두개여도 앞에 것만 나온다.

//        System.out.println(targets[0].length());
        List<Integer> answer = new ArrayList<>();
         for(int i = 0; i < targets.length; i++){
             int add = 0;
             System.out.println(i);
            for(int j = 0; j < targets[i].length(); j++){
                System.out.println("target"+i+"의 "+j+":" +targets[i].substring(j, j+1));
                List<Integer> index = new ArrayList<>();

                for(int k = 0; k < keymap.length; k++){
                    System.out.println("keymap index : " + keymap[k].indexOf(targets[i].substring(j, j+1)));
                    int kindex = keymap[k].indexOf(targets[i].substring(j, j+1));

//                    if(kindex >= 0 ){
                        index.add(kindex);
//                    }

                }
                index.sort(Comparator.naturalOrder());
                System.out.println("인덱스1"+index);
                System.out.println(index.get(0));
                if(index.get(0)==-1 && index.size()==(index.lastIndexOf(-1)+1)) {
                    System.out.println("인덱스2"+index);
                    add = -1;
                    break;
                }else{
                    System.out.println("인덱스3"+index);
                    System.out.println("마지막"+index.lastIndexOf(-1)+"사이즈"+(index.size()-1));
                    if(index.lastIndexOf(-1)==(index.size()-1)){
                        System.out.println("index0"+index.get(0));
                        add = -1;
                        break;
                    }
                    System.out.println("다음"+(index.get(index.lastIndexOf(-1)+1) + 1));
                    add += (index.get(index.lastIndexOf(-1)+1) + 1);

                }
            }
             answer.add(add);
        }
        System.out.println(answer);
//        return answer;
//        }
    }
}
