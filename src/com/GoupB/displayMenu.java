package com.GoupB;

/**
 * Created by abirfaisal on 2/3/15.
 */

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.*;

public class displayMenu {

    //returns value from 1-4 to signify a seleciton
    public static int mainMenu() {
        //Displays  main menu
        System.out.print("6.18 Check Password \n");
        System.out.print("6.21 Phone Keypad \n");
        System.out.print("6.27 EMIRP \n");
        System.out.print("6.29 Twin Primes \n");
        //get input
        Scanner b = new Scanner(System.in);
        int c = b.nextInt();

        //Check input
        if (c < 1 | c > 4) {
            System.out.print("Invalid Input \n");
            displayMenu.mainMenu();
        }
        return c;
    }
    // somone comment this too lazy
    public static char passwordMenu[]{
        System.out.print("Please enter your password");
        Scanner a = new Scanner(System.in);
        char b = a.next();
        return b;
    }

    public static void phoneKeypadMenu(){

    }

    public static void EMIRPMenu(){

    }

    public static void twinPrimesMenu(){

    }
}