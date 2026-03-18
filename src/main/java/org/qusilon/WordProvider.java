package org.qusilon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WordProvider {
    public static void getWord() throws IOException {
        InputStream is = WordProvider.class.getClassLoader().getResourceAsStream("words");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        System.out.println(reader.lines().skip(getRandomNumber()).findFirst().orElse(null));
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 20393);
    }
}
