package lesson7;

public class RepeatMethodError {

    public void test(String string) {
        System.out.println(string);
    }

    public void test(int val) {
        System.out.println(val);
    }

    public void test(int val, String string) {
        System.out.println(string + val);
    }

//    public void test(int val, String string) {
//        System.out.println(string + val);
//    }

    public void test(String string, int val) {
        System.out.println(string + val);
    }
}
