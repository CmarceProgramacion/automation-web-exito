package com.exito.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomElementsUtil {
    private static final int QUANTITY_NUMBERS = 5;
    private static final int MAX_AMOUNT = 10;

    public static List<Integer> generateRandomNumbers(int maximumNumber) {
        List<Integer> listNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < QUANTITY_NUMBERS; i++) {
            int number = random.nextInt(maximumNumber);
            if (!listNumbers.contains(number)) {
                listNumbers.add(number);
            }
        }

        return listNumbers;
    }

    public static int generateRandomUnits() {
        Random random = new Random();
        return random.nextInt(MAX_AMOUNT) + 1;
    }
}