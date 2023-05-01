//https://www.youtube.com/watch?v=vLJtpj5v98g&list=PLqaSEyuwXkSopmCFiv0v7seTIRN5rrEtP&index=22
//사용자의 값을 입력하는 구현(예로 input 메소드), 입력 값에 따라 사칙연산 구현(예로 main 메소드), 사칙연산 결과 값을
//출력하는 구현(예로 output 메소드)을 서로 다른 메소드로 나누어 구현한다.
//사용자의 값을 입력하는 구현은 첫 번째 숫자 값, 사칙연산 기호 및 quit, 두 번째 숫자 값 입력으로 나뉜다.

import java.util.Scanner;

public class Calculator {
    static int getFirstValue(Scanner sc) {
        System.out.print("숫자를 입력하세요 > ");
        int first = sc.nextInt();
        return first;
    }
    static int getSecondValue(Scanner sc) {
        System.out.print("숫자를 입력해주세요 > ");
        int second = sc.nextInt();
        return second;
    }

    static String getSymbol(Scanner sc) {
        System.out.println("사칙연산 : (+, -, *, /)");
        System.out.println("프로그램종료 : quit");
        System.out.print("> ");
        String symbol = sc.next();
        return symbol;
    }

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

    static void print(int result) {
        System.out.println("결과 : " +result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<사칙연산 프로그램> 입니다.");
        int first = getFirstValue(sc);
        int result = first;
        while (true) {
            String symbol = getSymbol(sc);
            // 무한루프 방지 종료 구문
            if("quit".equals(symbol)) {
                print(result);
                break;
            }
            int second = getSecondValue(sc);

            result = calculate(result, symbol, second);

        }
        System.out.println("----------------------");


    }
}
