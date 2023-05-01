import java.util.Scanner;

public class Input {
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
}
