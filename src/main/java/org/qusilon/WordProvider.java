package org.qusilon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordProvider {

    public static final List<String> WORDS = loadWords();

//    public static String getWord() {
//        InputStream is = WordProvider.class.getClassLoader().getResourceAsStream("words.txt");
//        try (
//                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//        ) {
//            return reader.lines().skip(getRandomNumber()).findFirst().orElse(null);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    private static List<String> loadWords() {
        InputStream is = WordProvider.class.getClassLoader().getResourceAsStream("words.txt");
        if (is == null) {
            throw new IllegalStateException("Файл words не найден в resources");
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is));) {
            return reader.lines().toList();
        } catch (IOException e) {
            throw new RuntimeException("Ошибка чтения файла words.txt");
        }

    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 20393);
    }
}
