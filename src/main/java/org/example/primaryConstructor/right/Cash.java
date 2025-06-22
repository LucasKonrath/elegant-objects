package org.example.primaryConstructor.right;

public class Cash {
    private int dollars;

    Cash(float dollars) {
        this((int) dollars);
    }

    Cash(String dollars) {
        this(Cash.parse(dollars));
    }

    private static int parse(String dollars) {
        return Integer.parseInt(dollars.replace("$", ""));
    }

    Cash(int dollars) {
        this.dollars = dollars;
    }
}
