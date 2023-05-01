//https://www.youtube.com/watch?v=hJMQz3HqzoM&list=PLqaSEyuwXkSopmCFiv0v7seTIRN5rrEtP&index=23
//사용자의 값을 입력하는 구현(예로 Input 클래스), 입력 값에 따라 사칙연산 구현(예로 Calculator 클래스),
//사칙연산 결과 값을 출력하는 구현(예로 Output 클래스)을 서로 다른 클래스로 나누어 구현한다.
//main 메소드는 입력 값에 따라 사칙연산 구현하는 클래스에 구현하고 실행한다.

import java.util.Scanner;

public class Calculator {
    static int calculate(int first, String symbol, int second) {
        int result = 0;
        if("+".equals(symbol)) {
            result = first + second;
            System.out.println("덧셈 : " + result);

        } else if ("-".equals(symbol)) {
            result = first - second;
            System.out.println("뺄셈 : " + result);
        } else if ("*".equals(symbol)) {
            result = first * second;
            System.out.println("곱셈 : " + result);
        } else if("/".equals(symbol)) {
            result = first / second;
            System.out.println("나눗셈 : " + result);
        } else {
            System.out.println("사칙연산기호를 입력하지 않았습니다. 다시 실행해주세요.");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<사칙연산 프로그램> 입니다.");
        int result = Input.getFirstValue(sc);
        while (true) {
            String symbol = Input.getSymbol(sc);
            // 무한루프 방지 종료 구문
            if("quit".equals(symbol)) {
                Output.print(result);
                break;
            }
            int second = Input.getSecondValue(sc);

            result = calculate(result, symbol, second);
        }
        sc.close();

    }
}
