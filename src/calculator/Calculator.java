package calculator;

public class Calculator {
    public static void main(String[] args) {
        App calculator = new App(350, 500);
        calculator.setUpApp();
        calculator.setUpButtonListeners();
    }
}
