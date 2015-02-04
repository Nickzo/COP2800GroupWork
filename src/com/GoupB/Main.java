package com.GoupB;

import java.*;

public class Main {

    public static void main(String[] args) {

        //Display inital Menu
        int selection = displayMenu.mainMenu();

        // Somone put this in a class like mainSwitch.selection(selection)
        // send selection to the switch
        switch (selection){
            case 1:
                break;
            case 2:
                break:
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.print("somthing happened");
                break;
        }

        System.out.print(selection); //Check value of slection

    }
}
