package org.qusilon;

import java.util.Arrays;

public class GameState {
    private final int MAX_MISTAKES = 6;
    private int countMistakes = 0;
    private final String secretWord;
    private final char[] openLetters;

    public GameState(String secretWord) {
        this.secretWord = secretWord;
        this.openLetters = new char[secretWord.length()];
        Arrays.fill(openLetters, '_');
    }

    public int getMAX_MISTAKES() {
        return MAX_MISTAKES;
    }

    public int getCountMistakes() {
        return countMistakes;
    }

    public void setCountMistakes(int countMistakes) {
        this.countMistakes = countMistakes;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public char[] getOpenLetters() {
        return openLetters;
    }
}
