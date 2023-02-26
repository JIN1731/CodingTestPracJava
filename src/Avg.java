import java.util.Scanner;

public class Avg {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int A[] = new int[N];
//
//        for(int i = 0; i < N; i++){
//            A[i] = sc.nextInt();
//        }
//
//        long sum = 0;
//        long max = 0;
//
//        for(int i = 0; i < N; i++){
//            if(A[i] > max) max = A[i];
//            sum = sum + A[i];
//        }
//        System.out.println(sum*100.0/max/N);
//    }

    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("과목 수 입력 : ");

            try {
                int N = sc.nextInt();
                long sum = 0;
                long max = 0;

                System.out.print("점수 입력 : ");

                for (int i = 0; i < N; i++) {

                    int temp = sc.nextInt();

                    if (temp > max) max = temp;
                    sum = sum + temp;
                }
                System.out.println("조작된 평균 : " + sum * 100.0 / max / N);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("숫자만 입력하세요.");

            }
        }

    }
}
