package org.example.approaches.declarative;

public class Between extends Number {
    private final Number num;
    Between(Number left, Number right, Number x){
        this.num = new Min(new Max(left, x), right);
    }

    @Override
    public int intValue() {
        return this.num.intValue();
    }

    @Override
    public long longValue() {
        return this.num.longValue();
    }

    @Override
    public float floatValue() {
        return this.num.floatValue();
    }

    @Override
    public double doubleValue() {
        return this.num.doubleValue();
    }

    private class Min extends Number {

        private final Number num;

        Min(Number left, Number right) {
            this.num = left.doubleValue() < right.doubleValue() ? left : right;
        }

        @Override
        public int intValue(){
            return this.num.intValue();
        }

        @Override
        public long longValue() {
            return this.num.longValue();
        }

        @Override
        public float floatValue() {
            return this.num.floatValue();
        }

        @Override
        public double doubleValue() {
            return this.num.doubleValue();
        }

    }

    private class Max extends Number {

        private final Number num;

        Max(Number left, Number right) {
            this.num = left.doubleValue() > right.doubleValue() ? left : right;
        }

        @Override
        public int intValue(){
            return this.num.intValue();
        }

        @Override
        public long longValue() {
            return this.num.longValue();
        }

        @Override
        public float floatValue() {
            return this.num.floatValue();
        }

        @Override
        public double doubleValue() {
            return this.num.doubleValue();
        }

    }

    public static void main(String[] args) {
        Between between = new Between(5, 9, 10);
        System.out.println("Between: " + between.intValue()); // Output: Between: 15
    }
}
