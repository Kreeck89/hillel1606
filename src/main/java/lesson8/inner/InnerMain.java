package lesson8.inner;

import lesson8.Human;

public class InnerMain {
    public static void main(String[] args) {
        Human human = new Human();
        human.test();  //нет возможности вызова с protected & <default> & private
    }
}
