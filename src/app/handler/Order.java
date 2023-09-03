package app.handler;

import app.drinks.Cappucino;
import app.drinks.Drinks;
import app.drinks.Espresso;
import app.drinks.Latte;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Order {
    private Drinks drink;

    public void setDrink(Drinks drink) {
        this.drink = drink;
    }

    public void getDrink() {
        drink.make();
    }

    public void userDrinkSwitcher() {

        try {
            Scanner sc = new Scanner(System.in);

            switch (sc.nextInt()) {
                case 1 -> {
                    setDrink(new Espresso());
                    getDrink();
                }
                case 2 -> {
                    setDrink(new Cappucino());
                    getDrink();
                }
                case 3 -> {
                    setDrink(new Latte());
                    getDrink();
                }
                case 0 -> {
                    System.out.println("Дякуюємо. Приходьте ще.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Нема такого напою! Спробуйте ще раз.");
                    userDrinkSwitcher();
                }
            }
            sc.close();
        } catch (InputMismatchException ime) {
            System.err.println("Некоректне введення! Спробуйте ще раз.");
            userDrinkSwitcher();
        }
    }
}