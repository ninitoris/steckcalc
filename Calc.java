// Калькулятор арифметических формул.
public class Calc extends Compf {
    private StackInt s;


    private static int char2int(char c) {
        return (int)c - (int)'0';
    }
    private static int char16To10(char c){
        String tempStr = "";
        tempStr += c;
        int tempInt = Integer.parseInt(tempStr, 16);
        return (tempInt);
    }
    protected int symOther(char c) {
        if ((c < '0' || c > '9')&&(c < 'a' || c > 'f')) {
            System.out.println("Недопустимый символ: " + c);
            System.exit(0);
        }
        return SYM_OTHER;
    }
    protected void nextOper(char c) {
        int second = s.pop();
        int first = s.pop();
        switch (c) {
            case '+':
                s.push(first + second);   break;
            case '-':
                s.push(first - second);  break;
            case '*':
                s.push(first * second);   break;
            case '/':
                s.push(first / second);  break;
        }
    }
    protected void nextOther(char c) {
        if (ThereJustWasNum){

            int tempInt = (s.pop())*16+char16To10(c);
            if (tempInt > 14745) {
                System.out.println("Вы ввели число больше 3999");
                System.exit(0);
            }
            s.push(tempInt);
            ThereJustWasNum = true;
        }
        else
            {
                s.push(char16To10(c));
                ThereJustWasNum = true;
            }
    }
    public Calc() {
        s = new StackInt();
    }
    public final void compile(char[] str) {
        super.compile(str);
        System.out.println("" + s.top());
        ThereJustWasNum = false;
    }
}