package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.atomic.DoubleAccumulator;import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class App {
    public static void main(String[] args) {

        //---------Aufgabe 1 --------------
        oneMonthCalendar(31, 3);


        //--------Aufgabe 2 ---------------
        long seed_num = 0;
        long[] a = lcg(seed_num);
        // for Schleife um den Inhakt vom Arry auszugeben
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        //----------Aufgabe 3 ---------------
        int rand_number = randomNumberBetweenOneAndHundred();
        guessingGame(rand_number);


        //----------Aufgabe 4 ---------------
        int[] Array1 = {1,2,3,4,5};
        int[] Array2 = {100,99,60,44,2};

        swapArrays(Array1, Array2);

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
                            System.out.println("");
                        }
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
            System.out.println();
        }
    }

    public static long[] lcg(long seed) {

        //Zahlen und die Werte definieren
        long[] arr = new long[10];
        long a = 1103515245;
        long c = 12345;
        double m = Math.pow(2, 31);
        long m_long = (new Double(m)).longValue();

        //Array bef??llen mit Formel
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = (a * seed + c) % m_long;
            } else {
                //formel einsetzen
                arr[i] = (a * arr[i - 1] + c) % m_long;
            }
        }
        return arr;
    }

    public static void guessingGame(int numberToGuess) {
        Scanner sn = new Scanner(System.in);
        int input = 0;
        int number = 1;
        do {
            System.out.print("Guess number " + number + ": ");
            input = sn.nextInt();

            if(input < numberToGuess && number != 10)
            {
                System.out.println("The number AI picked is higher than your guess.");
            }
            else if (input > numberToGuess && number != 10)
            {
                System.out.println("The number AI picked is lower than your guess.");
            }
            if (input == numberToGuess) {
                System.out.println("You won wisenheimer!");
                break;
            }
            if( number == 10 && input != numberToGuess){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            }
            number++;
        }  while (number <= 10) ;
        }

        public static int randomNumberBetweenOneAndHundred(){
        Random random_num = new Random();
         int random = random_num.nextInt(100);
         return  random;

        }

        /*
        public static  boolean swapArrays(int[] Array1, int[] Array2){

        int i;

        int [] arr1_swap = Array1;
        int [] arr2_swap = Array2;

        if( Array1.length != Array2.length )
        {
            return false;
        }
        else {
        for(i = 0; i < 5; i++)
        {
            Array1[i] = Array1[i] + Array2[i];
            Array2[i] = Array1[i] - Array2[i];
            Array1[i] = Array1[i] - Array2[i];
        }

         return true;

        }

         */
        public static boolean swapArrays( int[] arr1, int[] arr2)
        {
            int swap;

            if( arr1.length != arr2.length )
            {
                return false;
            }

            for( int i = 0; i < arr1.length; i++ )
            {
                swap = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = swap;
            }

            return true;
        }


    }


