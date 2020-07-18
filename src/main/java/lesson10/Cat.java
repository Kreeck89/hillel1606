package lesson10;

public class Cat extends Animal implements RelaxAction {

    @Override
    public void defaultMove() {
        System.out.println("Cat is not running");
        //new logic
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    /**
     * @param string Перегрузка метода с входящим параметром
     */
    public void defaultMove(String string) {
        System.out.println("Move with " + string);
    }

    @Override
    public void relax() {
        System.out.println("Cats can only relax!!!");
    }

    @Override
    public void relax(int days) {
        System.out.println("Cats can relax only " + days + " days!");
    }
}
