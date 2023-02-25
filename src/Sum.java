import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int zeroCount = 0;

        while (true) {
            Scanner sc = new Scanner(System.in);

//        int N = sc.nextInt();

            System.out.print("숫자 입력 : ");
            String sNum = sc.next();

            char[] cNum = sNum.toCharArray();

            int sum = 0;

            for (int i = 0; i < cNum.length; i++) {
                if (cNum[i] - '0' < 0 || cNum[i] - '0' > 9) {
                    System.out.println("숫자만 입력하세요.");
                    break;
                }
                if(cNum[i] - '0' == 0){
                    zeroCount++;
                }
                sum += cNum[i] - '0'; // OR -48 ASCII CODE 이용
            }
            if (zeroCount == cNum.length) {
                System.out.println("합 : 0");
            } else if (sum != 0) {
                System.out.println("합 : " + sum);
            }
//            System.out.println("합 : " + sum);
        }
    }
}
