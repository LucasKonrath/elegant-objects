package org.example.immutability.wrong;

public class Cash {
    private int dollars;
    Cash(int dollars){
        this.dollars = dollars;
    }

    public void mul(int factor) {
        // This method mutates the state of the object, which is not recommended for immutable objects.
        this.dollars *= factor;
    }

    public static void main(String[] args) {
        Cash cash = new Cash(100);
        cash.mul(2);
        System.out.println("Cash: " + cash.dollars); // Output: Cash: 200
        // This shows that the original object has been mutated, which is against the principles of immutability.
    }
}
