package org.example.approaches.imperative;

public class MathExample{
    public static int between(int l, int r, int x){
        return Math.min(Math.max(l, x), r);
    }
}
