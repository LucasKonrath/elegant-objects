package org.example.avoidErSuffix.right;

public class Cash {
    private int dollars;

    public Cash(int dollars) {
        this.dollars = dollars;
    }

    public String usd() {
        return String.format("$%,d", dollars);
    }
}
