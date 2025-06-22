package org.example.primaryConstructor.wrong;

public class Cash {
    private int dollars;

    Cash(float dollars){
        this.dollars = (int) dollars;
    }

    Cash(String dlr){
        this.dollars = Cash.parse(dlr);
    }

    Cash(int dlr){
        this.dollars = dlr;
    }

    private static int parse(String dlr) {
        return Integer.parseInt(dlr.replace("$", ""));
    }
}
