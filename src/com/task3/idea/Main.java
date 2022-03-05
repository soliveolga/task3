package com.task3.idea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Количество строк:");
        int count = Integer.parseInt(reader.readLine());
        String stringWithMaxUniqCount = "";
        int maxUniqCount = 0;

        for(int i = 0; i < count; ++i) {
            System.out.println("Строка " + (i + 1));
            String currentString = reader.readLine();
            String uniqString = "";

            int uniqCount;
            for(uniqCount = 0; uniqCount < currentString.length(); ++uniqCount) {
                String currentChar = String.valueOf(currentString.charAt(uniqCount));
                if (!uniqString.contains(currentChar)) {
                    uniqString = uniqString + currentChar;
                }
            }

            uniqCount = uniqString.length();
            if (uniqCount > maxUniqCount) {
                maxUniqCount = uniqCount;
                stringWithMaxUniqCount = currentString;
            }
        }

        System.out.println("Ответ: " + stringWithMaxUniqCount);
    }
}

