package com.systex.main;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Lottery {
    public static void main(String[] args) {
        int n = 0;
        int args0 = Integer.parseInt(args[0]);
//        int randomNum;
        String numbers = args[1];
        int[] array = Stream.of(numbers.split(" "))
                    .mapToInt(token -> Integer.parseInt(token))
                    .toArray();

        for (int i = 0; i < args0; i++) {
            System.out.println(doStuff(args0, array));
        }
    }
    public static Set<Integer> doStuff(int args0, int[] array) {
        Random random = new Random();
        int randomNum;
        Set<Integer> intSet = new TreeSet<>();
        while (intSet.size() < 6) {
            randomNum = random.nextInt(50) + 1;
            intSet.add(randomNum);
            for (int k = 0; k < array.length; k++) {
                if (intSet.contains(array[k])) {
                    intSet.remove(randomNum);
                    randomNum = (int) (Math.random() * 50);
                    k = -1;
                    break;
                }
            }
        }
        return intSet;
    }
}
