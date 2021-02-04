package com.sparta.malik;

public class Fibonnaci {

    public static void PrintIterative(int NumOfValues) {
        int[] fib = new int[NumOfValues];
        for (int i = 0; i < NumOfValues; i++) {
            if (i < 2) {
                fib[i] = i;
            } else {
                fib[i] = fib[i - 2] + fib[i - 1];
            }
            Printer.printMessage("Fibonacci[" + i + "] = " + fib[i]);
        }
    }

    public static void PrintRecursive(int NumOfValues) {
        int[] fib = new int[NumOfValues];
        for (int i = 0; i < NumOfValues; i++) {
            fib[i] = fib(i);
            Printer.printMessage("Fibonacci[" + i + "] = " + fib[i]);
        }
    }

    private static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

}
