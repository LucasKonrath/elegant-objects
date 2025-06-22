package org.example.alwaysUseInterfaces.wrong;

public class Cash {
    private int dollars;
    private int cents;
    Cash(float dollars) {
        this.dollars = (int) dollars;
        this.cents = (int) ((dollars - this.dollars) * 100);
    }
    public int cents(){
        return cents;
    };
}
