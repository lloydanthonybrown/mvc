package com.lloyd.brown;

import java.util.ArrayList;

public class Model {

    // Private attributes for a single stored value and an Arraylist.
    private ArrayList<Integer> storedValues = new ArrayList();

    // Default Constructor which each class should have
    public Model(){

    }

    // Setter for the store value that will be set by the Controller
    public void addStoredValue(int storedValue)
    {
        try {
            storedValues.add(storedValue);
            System.out.println("Model says: information stored successfully");
        }
        catch (Exception e)
        {
            System.out.println("Model says: ERROR information could not be stored in model");
            e.printStackTrace();
        }
    }

    // Getter for the Arraylist to display the values set by the user and stored in the Model to the View.
    public ArrayList<Integer> getStoredValues() {
        return storedValues;
    }

}
