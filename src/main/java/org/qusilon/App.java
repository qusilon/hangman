package org.qusilon;

import java.io.IOException;
import java.util.Scanner;

public class App {
    static void main(String[] args) throws IOException {
        runMenu();
    }

    static void runMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру Виселица!");
        while (true) {
            System.out.println("Введите нужную цифру из меню и нажмите Enter.");
            System.out.println("1 - Новая игра");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");
            String choice = scanner.next();
            System.out.println();

            if (choice.equals("1")) {
                Game game = new Game();
                game.start();
            } else if (choice.equals("0")) {
                scanner.close();
                break;
            } else {
                System.out.println("Такой цифры в меню нет, попробуте еще раз.");
            }
        }
    }
}
