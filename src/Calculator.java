import java.util.Scanner;

//https://www.youtube.com/watch?v=L0vebymx7-s&list=PLqaSEyuwXkSopmCFiv0v7seTIRN5rrEtP&index=19
//요구사항
//사용자로부터 2개의 숫자 값을 입력 받은 후 2개의 숫자 값을 활용해 사칙연산을 계산한다.
//계산한 결과 값을 화면에 출력한다.
public class Calculator {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("<사칙연산 프로그램> 입니다.");
        System.out.println("----------------------");
        System.out.print("숫자를 입력해주세요 > ");
        num1 = sc.nextInt();
        System.out.print("숫자를 입력해주세요 > ");
        num2 = sc.nextInt();

        System.out.println("입력하신 숫자는 " + num1 + "," +num2 + " 입니다.");
        System.out.println("-----연산결과입니다.-----");
        System.out.println("더하기(+) : " + (num1 + num2));
        System.out.println("빼기(-) : " + (num1 - num2));
        System.out.println("곱하기(*) : " + (num1 * num2));
        System.out.println("나누기(/) : " + (num1 / num2));
        System.out.println("----------------------");

    }
}
