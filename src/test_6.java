public class test_6 {
    public static void main(String[] arg) {
        int a = 5;
        int b = 2;
        Operation operation = new Operation();
        int result1 = operation.increment(a);
        System.out.println("Result of increment = " + result1);
        int result2 = operation.decrement(a);
        System.out.println("Result of decrement = " + result2);
        int result3 = operation.subtraction(a, b);
        System.out.println("Result of subtraction = " + result3);
    }
}
