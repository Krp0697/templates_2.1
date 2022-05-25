import Templates_2.Ints;
import Templates_2.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(3, 4));
        System.out.println(intsCalc.mult(3, 22));
        System.out.println(intsCalc.sub(1000, 7));
        System.out.println(intsCalc.pow(2, 4));
    }
}
