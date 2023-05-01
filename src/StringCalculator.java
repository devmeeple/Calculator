import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계산할 값을 입력하세요(예) 1 + 3 + 7 > ");

        String value = sc.nextLine();
        System.out.println("입력한 식 : " +value);

        String[] values = value.split(" ");

        int first = Integer.parseInt(values[0]);
//        System.out.println("first : " + first);

        int result = first;
        for(int i = 1; i < values.length; i +=2) {
            String symbol = values[i];
            System.out.println("기호 : " + symbol);

            int second = Integer.parseInt(values[i + 1]);
//            System.out.println("second : " + second);

            result = Calculator.calculate(result, symbol, second);
        }

        Output.print(result);
    }
}
