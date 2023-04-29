//https://www.youtube.com/watch?v=HvAByhhKu-E&list=PLqaSEyuwXkSopmCFiv0v7seTIRN5rrEtP&index=22
//한 번에 2개의 숫자 값만 사칙연산을 하는 것이 아니라 여러 개의 사칙연산이 가능해야 한다.
//앞 단계에서 계산한 결과 값은 이후 연산의 첫번째 값으로 사용해야 한다.
//    예를들어 4 + 2 * 3의 순서로 값을 입력하면 먼저 4+2가 계산되고 결과 값 6과 3의 곱셈을 통해 18의 계산 결과가 나와야 한다.
//사칙연산 기호 대신 "quit"이라는 문자열을 입력하면 최종 계산 결과를 출력하고 프로그램을 종료한다.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<사칙연산 프로그램> 입니다.");
        System.out.print("숫자를 입력하세요 > ");
        int num1 = sc.nextInt();
        int result = num1;
        while (true) {
            System.out.println("----------------------");
            System.out.println("명령을 입력해주세요. ");
            System.out.println("사칙연산 : (+, -, *, /)");
            System.out.println("프로그램종료 : quit");
            System.out.print("> ");

            String symbol = sc.next();

            // 무한루프 방지 종료 구문
            if("quit".equals(symbol)) {
                System.out.println("연산결과입니다.");
                System.out.println(result);
                break;
            }

            System.out.print("숫자를 입력해주세요 > ");
            int num2 = sc.nextInt();

            if("+".equals(symbol)) {
                result = result + num2;
            } else if ("-".equals(symbol)) {
                result = result - num2;
            } else if ("*".equals(symbol)) {
                result = result * num2;
            } else if("/".equals(symbol)) {
                result = result / num2;
            } else {
                System.out.println("사칙연산기호를 입력하지 않았습니다. 다시 실행해주세요.");
            }

        }
        System.out.println("----------------------");


    }
}
