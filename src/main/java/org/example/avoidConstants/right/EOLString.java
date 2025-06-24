package org.example.avoidConstants.right;

public class EOLString {
    private final String origin;

    EOLString(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return String.format("%s\r\n", origin);
    }
}
