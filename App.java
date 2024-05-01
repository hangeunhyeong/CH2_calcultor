import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        LinkedList<Double> resultList = new LinkedList<>();
        int lastIndex = 0;

        int firstInt;
        int secondInt;
        char operator;
        double result = 0;

        String endCommand = "exit";
        String removeCommand = "remove";
        String inquiryCommand = "inquiry";
        String decide;


        do {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            firstInt = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            secondInt = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    result = firstInt + secondInt;
                    break;
                case '-':
                    result = firstInt - secondInt;
                    break;
                case '*':
                    result = firstInt * secondInt;
                    break;
                case '/': {
                    if (secondInt == 0)
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");

                    else
                        result = (double) firstInt / secondInt;
                }
                break;
            }

            System.out.println("결과: " + result);
            resultList.add(result);


            System.out.println(resultList.toString());

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String buffer;
            buffer = sc.nextLine();
            decide = sc.nextLine();
            if (decide.equals(removeCommand)) {
                resultList.remove(0);
            }

            System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            decide = sc.nextLine();
            if (decide.equals(inquiryCommand)) {
                for (double inquiryResult : resultList) {
                    System.out.println(inquiryResult);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            decide = sc.nextLine();


        } while (!decide.equals(endCommand));


    }


}


