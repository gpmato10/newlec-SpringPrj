package aop;

/**
 * Created by dw on 2016. 4. 30..
 */
public class Program {
    public static void main(String[] args) {
        Calculator cal = new NewlecCalculator();
        System.out.println(cal.add(3, 4));
    }
}
