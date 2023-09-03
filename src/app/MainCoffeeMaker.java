package app;

import app.handler.Order;

public class MainCoffeeMaker {

    public static void main(String[] args) {

        Order order = new Order();

        System.out.println("\033[4m" + "ВІТАЄМО ВАС У НАШІЙ КАВ'ЯРНІ =)" + "\033[0m" + "\n");
        System.out.println("""
                Оберіть будь ласка напій:
                1 - ESPRESSO
                2 - CAPPUCINO
                3 - LATTE
                0 - нічого
                """);
        order.userDrinkSwitcher();
    }
}