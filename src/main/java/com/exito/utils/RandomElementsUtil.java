package com.exito.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomElementsUtil {
    public static List randomLocation(int maximumNumber) {

        System.out.println("-----" + maximumNumber);
        int quantityNumbers = 2;
        Random random = new Random();
        List<Integer> listNumbers = new ArrayList<>();

        while (listNumbers.size() < quantityNumbers) {
            int number = random.nextInt(maximumNumber);
            if (!listNumbers.contains(number)) {
                listNumbers.add(number);
            }
        }
        System.out.println(listNumbers);
        return listNumbers;
    }

    public static int randomUnits() {
        int unit;
        int maxAmount = 3;
        Random random = new Random();
        unit = random.nextInt(maxAmount) + 1;
        System.out.println("unidades: " + unit);
        return unit;
    }
}

