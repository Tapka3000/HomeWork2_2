package AdditionalWork4;

public class Dog implements Runnable {

    @Override
    public void run(String s) {
        System.out.println("Собака говорит - " + s);
    }
}
