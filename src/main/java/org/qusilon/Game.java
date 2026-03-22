package org.qusilon;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        GameState state = new GameState("секрет");
        while (!String.valueOf(state.getOpenLetters()).equals(state.getSecretWord()) && state.getCountMistakes() < 6) {
            char letter = readInput();
            boolean yes = false;
            for (int i = 0; i < state.getSecretWord().length(); i++) {
                if (state.getSecretWord().charAt(i) == letter) {
                    state.getOpenLetters()[i] = letter;
                    yes = true;
                }
            }
            if (!yes) {
                state.setCountMistakes(state.getCountMistakes() + 1);
            }
            System.out.println("Количество ошибок: " + state.getCountMistakes());
            System.out.println(String.valueOf(state.getOpenLetters()));
        }

    }

    private char readInput() {
        System.out.print("Введите предпологаемую букву: ");
        String letter = scanner.nextLine().toLowerCase();
        return letter.charAt(0);
    }
}
