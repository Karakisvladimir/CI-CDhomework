package org.example.calculator;

public class Sum {
    public long sum(int number) {
        long temp = 1;

        if (number <= 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 1; i <= number; i++) {
            temp = temp * i;
        }

        return temp;
    }
}
