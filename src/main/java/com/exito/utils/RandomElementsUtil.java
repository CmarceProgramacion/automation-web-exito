package com.exito.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomElementsUtil {
    public static List<Integer> randomProduct(int maximumNumber) {

        int quantityNumbers = 5;
        Random random = new Random();
        List<Integer> listNumbers = new ArrayList<>();

        while (listNumbers.size() < quantityNumbers) {
            int number = random.nextInt(maximumNumber);
            if (!listNumbers.contains(number)) {
                listNumbers.add(number);
            }
        }
        return listNumbers;
    }

    public static int randomUnits() {
        int unit;
        int maxAmount = 10;
        Random random = new Random();
        unit = random.nextInt(maxAmount) + 1;
        return unit;
    }
}