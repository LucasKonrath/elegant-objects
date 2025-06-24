package org.example.immutability.right;

public class Cash {
    private int dollars;
    Cash(int dollars){
        this.dollars = dollars;
    }
    
    public Cash mul(int factor) {
        // Instead of mutating the state of the object, we create a new instance with the modified value.
        return new Cash(dollars * factor);
    }

    public static void main(String[] args) {
        Cash cash = new Cash(100);
        Cash newCash = cash.mul(2);
        System.out.println("Original Cash: " + cash.dollars); // Output: Original Cash: 100
        System.out.println("New Cash: " + newCash.dollars); // Output: New Cash: 200
    }
}