package app.drinks;

public class Espresso implements Drinks {
    @Override
    public void make() {
        System.out.println("Your ESPRESSO. Enjoy :)");
    }
}