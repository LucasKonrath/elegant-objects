package org.example.unit.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashTest {

    public static class Cash {
        private int amount;

        public Cash(int amount) {
            this.amount = amount;
        }

        public Cash plus(Cash other) {
            // Instead of mutating the state of the object, we create a new instance with the modified value.
            return new Cash(this.amount + other.amount);
        }

        public Cash mul(int factor) {
            // Instead of mutating the state of the object, we create a new instance with the modified value.
            return new Cash(this.amount * factor);
        }

        public Cash(String amount){
            new Cash(Integer.parseInt(amount.replace("$", "")));
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Cash cash = (Cash) obj;
            return amount == cash.amount;
        }

    }

    @Test
    public void summarizes(){
        assertEquals(new Cash(100)
                .plus(new Cash(200)),
                new Cash(300));
    }

    @Test
    public void deducts(){
        assertEquals(new Cash("$7").plus(new Cash("$-3")),
                new Cash("$4"));
    }

    @Test
    public void multiplies(){
        assertEquals(new Cash("$2").mul(3), new Cash("$6"));
    }
}
