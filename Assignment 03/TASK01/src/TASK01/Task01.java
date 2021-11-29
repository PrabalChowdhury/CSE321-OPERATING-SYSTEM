/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TASK01;

public class Task01 implements Runnable {
    private int a, b;
    private String mode;

    public Task01(int a, int b, String mode) {
        this.a = a;
        this.b = b;
        this.mode = mode;
    }

    @Override
    public void run() {
        String output = null;
        switch (mode) {
        case "add":
            output = String.format("Sum: %s", a + b);
            break;

        case "sub":
            output = String.format("Sub: %s", a - b);
            break;

        case "mul":
            output = String.format("Mul: %s", a * b);
            break;

        case "div":
            output = String.format("Div: %.5f", 1.0 * a / b);
            break;

        case "oth":
            output = "No valid operation";
            break;
        }

        String threadName = Thread.currentThread().getName();
        System.out.printf("%s\n> %s\n", threadName, output);
    }
}