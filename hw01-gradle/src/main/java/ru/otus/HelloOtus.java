package ru.otus;

import com.google.common.math.DoubleMath;

public class HelloOtus {
    public static void main(String[] args) {
        var factorial = DoubleMath.factorial(5);
        System.out.println(factorial);
    }
}
