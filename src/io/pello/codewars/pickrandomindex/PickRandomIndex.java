package io.pello.codewars.pickrandomindex;

import java.util.ArrayList;
import java.util.Random;

public class PickRandomIndex {
    public int pickRandom(int[] numbers, int target) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != target) {
                continue;
            }
            list.add(i);
        }

        return list.size() == 0 ? -1 : list.get(random.nextInt(list.size()));

    }

    public int pickRandomAlt(int[] numbers, int target) {
        Random random = new Random();
        int result = -1;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != target)
                continue;
            if (random.nextInt(++count) == 0)
                result = i;
        }

        return result;
    }
}
