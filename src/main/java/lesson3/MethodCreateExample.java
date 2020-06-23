package lesson3;

public class MethodCreateExample {

    public static void calcSum(int a, int b) {
        System.out.println("Sun a+b: " + (a + b));
    }

    public double calcDiff(double a, double b) {
        System.out.println("inner params: " + a + ", " + b);
        // может быть любая логика метода....
        return a - b;
    }

    public void printText() {
        System.out.println("Hello from lesson 3!");
    }

    private void innerMethod() {
        System.out.println("Call inner method");
    }

    public String concatStrings(String first, String second) {
        String result = validate(first, second);
        return first + second;
    }

    private String validate(String first, String second) {
        if (first == null || second == null) {
            return null;
        }
        return first + second;
    }

    public void exampleMethod(Object obj, int first, String str, char ch) {

    }
}
