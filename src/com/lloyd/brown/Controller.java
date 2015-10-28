package com.lloyd.brown;

import java.util.ArrayList;

public class Controller {
    // Private Variable Model
    private Model myModel;

    // On the constructor instantiate an instance of Model
    public Controller(){
        myModel = new Model();
    }

    // Middle man method to get the value from View and pass it to the Controller
    public void storeUserValue(int userValue)
    {
        try{

            // Pass information to be stored in the Model
            myModel.addStoredValue(userValue);

            System.out.println("Controller says: information passed to Model successfully");
        }
        catch (Exception e)
        {
            System.out.println("Controller says: ERROR Information could not be passed to Model");
            e.printStackTrace();
        }
    }

    // Pass back data stored by user
    public ArrayList<Integer> obtainUserValues()
    {
        return myModel.getStoredValues();
    }
    // Pass back the variable from Model

    // Perform calculations on the ArrayList
    // Is it better to perform the calculations manually here in the Controller?
    // Or would it be better to assign the calculations to a variable here, and pass the results to the View?

    public ArrayList<Integer> obtainAverage(){
        myModeL.
    }

}
