public class Main {
    public static void main(String[] args) {
        Wife masha = new Wife("Маша");
        Husband petya = new Husband("Петя");

        Wardrobe doorW = new Wardrobe();

        masha.saySomething(); masha.comment();
        doorW.getDoor(masha);
        petya.saySomething(); petya.comment();
        doorW.getDoor(petya);
        doorW.saySomething();

    }
}