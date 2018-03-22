/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.exceptions;

/**
 *
 * @author Jenson, Casey, Thomas
 */
public class TeamStatusException extends Exception {
     

    public TeamStatusException() {
    }

    public TeamStatusException(String message) {
        super(message);
    }

    public TeamStatusException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamStatusException(Throwable cause) {
        super(cause);
    }

    public TeamStatusException(String message, Throwable cause,
                                                boolean enableSuppression,
                                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
