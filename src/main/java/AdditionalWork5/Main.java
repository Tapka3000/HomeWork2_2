package AdditionalWork5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 5, 10);

        System.out.println("Кота зовут " + cat.getName());
        System.out.println("Возраст кота " + cat.getAge());
        System.out.println("Вес кота " + cat.getWeight());
    }
}
