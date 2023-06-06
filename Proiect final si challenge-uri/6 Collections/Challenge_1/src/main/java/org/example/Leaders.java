package org.example;


import java.util.ArrayList;
import java.util.List;

public class Leaders {
    public static List<Integer> findLeaders(List<Integer> numbers) {
        List<Integer> leaders = new ArrayList<>();
        if (numbers.isEmpty()) {
            return leaders;
        }

        int maxRight = numbers.get(numbers.size() - 1);
        leaders.add(maxRight);

        for (int i = numbers.size() - 2; i >= 0; i--) {
            int current = numbers.get(i);
            if (current > maxRight) {
                leaders.add(current);
                maxRight = current;
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(16, 17, 4, 3, 5, 2);
        List<Integer> leaders = findLeaders(numbers);

        System.out.println("Leaders: " + leaders);
    }
}
