package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class App {
    //Exersice 1
    public static void main(String[] args) {
        oneMonthCalendar(31, 3);
    }
    public static void oneMonthCalendar(int numberDay, int startingDay) {
        int line = 0;
        int row = 0;
        for (int j = 1; j <= 7; j++) {
            if (j == startingDay) {
                for (int i = 1; i <= numberDay; i++) {
                    if (i <= 9) {
                        System.out.print(" " + i + " ");
                    } else {
                        System.out.print(i + " ");
                    }
                    line++;
                    if (line % 7 == 0) {
                        if (row <= 4) {
                            System.out.println("");}
                        row++;

                    }
                }
            } else if (line < startingDay) {
                System.out.print("   ");
                line++;
            }
            if (numberDay <= 2) {
                System.out.print("");
            }
        }
        if (line % 7 != 0) {
            System.out.println();}
    }
}


