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
public class GetFruitsException extends Exception {

    public GetFruitsException() {
    }

    public GetFruitsException(String message) {
        super(message);
    }

    public GetFruitsException(String message, Throwable cause) {
        super(message, cause);
    }

    public GetFruitsException(Throwable cause) {
        super(cause);
    }

    public GetFruitsException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
