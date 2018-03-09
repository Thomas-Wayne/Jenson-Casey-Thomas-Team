/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.util.Scanner;

/**
 *
 * @author Jenson, Thomas, Casey
 */
public interface ViewInterface {

    public void display();

    public String getInput();

    public boolean doAction(String value);

    public abstract class View implements ViewInterface {

        protected String displayMessage;

        public View() {

        }

        public View(String message) {
            this.displayMessage = message;
        }

        @Override
        public void display() {
            boolean endOfView = false;

            do {
                String value = this.getInput();

                if (value.toUpperCase().equals("Q")) {
                    return;
                }

                endOfView = this.doAction(value);

            } while (endOfView != true);

        }

        @Override
        public String getInput() {

            Scanner keyboard = new Scanner(System.in);
            String value = null;
            boolean valid = false;
            while (!valid) {

                System.out.println("\n" + this.displayMessage);
                value = keyboard.nextLine();
                value = value.trim();
                if (value.length() < 1) {

                    System.out.println("\nInvalid value: Value cannot be blank");
                    continue;
                }

                break;
            }
            return value;

        }
    }

}
