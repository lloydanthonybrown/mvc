package com.lloyd.brown;

import java.util.Scanner;

public class View {

    public static void main(String[] args){

        // Create two separate attributes for use in the class
        // Should these be private, public or protected?
        String userConfirmation;
        int stat;

        // Make an instance of the controller class to have access to its methods
        Controller myController = new Controller();

        // Do I need to create a new scanner each iteration, since I'll be asking for 5 values (or more)?
        Scanner userInput = new Scanner(System.in);
        boolean continueIteration = true;
        while(continueIteration) {

            System.out.println("Do you want to enter a number into the database? ('yes' to proceed)");

            // If they answer "yes", it will iterate through creating a scanner and assigning their input into an attribute
            // and will send that information automatically through the controller into the model to be stored in an
            // Arraylist.

            userConfirmation = userInput.next();
            if (userConfirmation.equals("yes")) {
                System.out.printf("Please enter an integer: ");
                stat = userInput.nextInt();
                myController.storeUserValue(stat);
                //Send the number to the controller
                //Send the number from the controller to the model
                //Call the method within the model to store it in an Arraylist
            } else {
                continueIteration = false;
                //Retrieve all the current integers stored in the Model
                //Display the current integers to the user
                //Perform a calculation on the current integers retrieved from the Model
                //Display the calculation to the user
            }
        }

        System.out.println("The current information in the database is: " + myController.obtainUserValues());
    }
}
