//https://www.youtube.com/watch?v=DPTCIw0mHWI&list=PLqaSEyuwXkSopmCFiv0v7seTIRN5rrEtP&index=20
//사용자에게 2개의 숫자 값과 사칙연산 기호(+, -, *, /) 중 하나를 입력받는다.
//사용자가 입력한 사칙연산 기호에 따라 사칙연산을 계산한 후 결과를 출력한다.
//예를 들어 사용자는 사용자는 값 2와 4 입력하고 곱셈(*) 기호를 입력하면 2 * 4의 결과인 8을 출력해야 한다.
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("<사칙연산 프로그램> 입니다.");
        System.out.println("----------------------");

        System.out.print("숫자를 입력해주세요 > ");
        num1 = sc.nextInt();

        System.out.print("사칙연산 기호(+, -, *, /)를 입력해주세요 > ");
        String symbol = sc.next();

        System.out.print("숫자를 입력해주세요 > ");
        num2 = sc.nextInt();


        System.out.println("입력하신 숫자와 기호는 " + num1 + "," + symbol + "," + num2 +" 입니다");
        System.out.println("-----연산결과입니다.-----");

        if("+".equals(symbol)) {
            System.out.println("더하기(+) : " + (num1 + num2));
        } else if ("-".equals(symbol)) {
            System.out.println("빼기(-) : " + (num1 - num2));
        } else if ("*".equals(symbol)) {
            System.out.println("곱하기(*) : " + (num1 * num2));
        } else if("/".equals(symbol)) {
            System.out.println("나누기(/) : " + (num1 / num2));
        } else {
            System.out.println("사칙연산기호를 입력하지 않았습니다. 다시 실행해주세요.");
        }
        System.out.println("----------------------");

    }
}
