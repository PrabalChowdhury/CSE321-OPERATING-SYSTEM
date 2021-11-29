/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TASK01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int b = sc.nextInt();

        Task01 runs1 = new Task01(a, b, "add");
        Task01 runs2 = new Task01(a, b, "sub");
        Task01 runs3 = new Task01(a, b, "mul");
        Task01 runs4 = new Task01(a, b, "div");
        Task01 runs5 = new Task01(a, b, "oth");

        Thread add = new Thread(runs1, "Addition Thread");
        Thread sub = new Thread(runs2, "Subtraction Thread");
        Thread mul = new Thread(runs3, "Multiplication Thread");
        Thread div = new Thread(runs4, "Division Thread");
        Thread oth = new Thread(runs5, "Other Threads");

        add.start();
        sub.start();
        mul.start();
        div.start();
        oth.start();

        try {
            add.join();
            sub.join();
            mul.join();
            div.join();
            oth.join();
        } catch (InterruptedException e) {
            // e.printStackTrace();
        }
    }
}
        