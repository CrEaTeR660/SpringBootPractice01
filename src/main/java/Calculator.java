public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        System.out.println("輸出結果為" + result);
    }

    public int divide(int x, int y) {
        return x/y;
    }
}
