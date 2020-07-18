package lesson10;

public class Dog extends Animal implements Action, Test {

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void work() {
        System.out.println("Only dogs can work perfect!");
    }

    @Override
    public void study() {
        System.out.println("Dogs studies better than cats");
    }

    @Override
    public void relax() {
        
    }

    @Override
    public void relax(int days) {

    }
}
