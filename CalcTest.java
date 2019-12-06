// Тест для калькулятора формул.
import java.util.Scanner;
public class CalcTest {
    public static void main(String[] args) throws Exception {
        Calc c = new Calc();
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Числа вводятся в шестнадцатеричной системе счисления и не превышают 3999");
        System.out.println("Ответ выводится в десятиричной системе счисления");
        while (true) {
            System.out.println("Введите формулу -> ");
            str = sc.nextLine();
            c.compile(str.toCharArray());
        }
    }
}