public class Husband extends Person {
    public Husband(String name) {
        super(name);
    }

    @Override
    void saySomething() {
        System.out.println("Доброе утро!");       
    }
}
