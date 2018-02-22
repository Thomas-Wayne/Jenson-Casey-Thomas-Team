/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

/**
 *
 * @author Thomas'
 */
public class StartProgramView {


    public StartProgramView() {
                
        
}
    public void DisplayStartProgramView() {
        boolean endOfView = false;
         do {
            String[] inputs = this.getInputs();
            if (inputs == null) {
                System.out.println("Please enter a valid name to continue.");
            } /*else if (inputs == String[Q]) {
                System.out.println("Thanks for playing!");
            } */else {
                endOfView = doAction(inputs);
            }
            System.out.println("Welcome to the longest ride of your life...");
        } while (endOfView != true);
    
    }

    private String[] getInputs() {
        System.out.println("getInputs() called");
        String[] inputs = new String[1];
        inputs[0] = "testInput";

        return inputs;
    }

    private boolean doAction(String[] inputs) {
        System.out.println(" doAction() called");
        System.out.println("\tinputs = " + inputs[0]);
        return true;
    }

    public void display() {
        System.out.println("display() has been called.");
    }
}
