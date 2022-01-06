/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Praba
 */
import java.util.Scanner;

public class SJF {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k, pid[], pp[], bt[], w[], ct[], t[], at[], fg[], i = 0;
        System.out.print("Enter the number of process : ");
        k = s.nextInt();
        pid = new int[k];
        pp = new int[k];
        bt = new int[k];
        w = new int[k];
        ct = new int[k];
        t = new int[k];
        at = new int[k];
        fg = new int[k];
        int st = 0, totalTime = 0;
        float awt = 0, att = 0;
        for (i = 0; i < k; i++) {
            System.out.print("Enter p" + (i + 1) + " burst time: ");
            bt[i] = s.nextInt();
            System.out.print("Enter p" + (i + 1) + " time priority: ");
            pp[i] = s.nextInt();
            pid[i] = i + 1;
        }
        while (true) {
            int c = k;
            int min = 999;
            if (totalTime == k) {
                break;
            }
            for (i = 0; i < k; i++) {
                if ((at[i] <= st) && (fg[i] == 0) && (bt[i] < min)) {
                    min = bt[i];
                    c = i;
                }

            }
            if (c == k) {
                st++;
            } else {
                ct[c] = st + bt[c];
                st = st + bt[c];
                t[c] = ct[c] - at[c];
                w[c] = t[c] - bt[c];
                fg[c] = 1;
                totalTime++;
            }
        }
        System.out.println("\nProcess \tArrival \tBurst \t\tComplete \tTurnaround \tWaiting");
        for (i = 0; i < k; i++) {
            awt = awt + w[i];
            att = att + t[i];
            System.out.println(pid[i] + "\t\t" + at[i] + "\t\t" + bt[i] + "\t\t" + ct[i] + "\t\t" + t[i] + "\t\t" + w[i]);
        }
        System.out.println("\nAverage Waiting time : " + (awt / k));
        System.out.println("Average Turnaround time : " + (att / k));
    }
}
