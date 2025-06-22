package org.example.avoidErSuffix.wrong;

public class CashFormatter {
    private int dollars;
    CashFormatter(int dollars) {
        this.dollars = dollars;
    }

    public String format() {
        return String.format("$%,d", dollars);
    }
}
