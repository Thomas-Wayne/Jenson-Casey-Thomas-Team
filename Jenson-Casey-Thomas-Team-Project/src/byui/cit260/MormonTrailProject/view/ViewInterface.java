/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import jenson.casey.thomas.team.project.CIT260.BYUICIT260MormonTrailProject;

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

        protected final BufferedReader keyboard = BYUICIT260MormonTrailProject.getInFile();
        protected final PrintWriter console = BYUICIT260MormonTrailProject.getOutFile();

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
            this.console.println("\n" + this.displayMessage);
            String value = null;
            boolean valid = false;

            try {

                while (!valid) {

                    value = this.keyboard.readLine();
                    value = value.trim();

                    if (value.length() < 1) {

                        ErrorView.display(this.getClass().getName(), "\nInvalid value: Value cannot be blank");
                        continue;
                    }

                    break;

                }

            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
            }

            return value;

        }

    }
}
