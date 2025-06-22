package org.example.alwaysUseInterfaces.right;

public class DefaultCash implements Cash {
    private final int dollars;

    DefaultCash (int dollars) {
        this.dollars = dollars;
    }

    @Override
    public Cash multiply(float factor) {
        return new DefaultCash((int) (this.dollars * factor));
    }
}
