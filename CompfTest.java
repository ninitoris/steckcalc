import java.util.Scanner;

public class CompfTest {
    public static void main(String[] args) throws Exception {
        Compf c = new Compf();
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("Введите формулу -> ");
            str = sc.nextLine();
            c.compile(str.toCharArray());
        }
    }
}