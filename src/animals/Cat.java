package animals;

public class Cat extends MiddleClass {
    @Override
    public void show() {
        super.show();
        System.out.println("а именно кот");
    }

    @Override
    public void demo() {
        System.out.println("демо кот");
    }
}
