/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.MormonTrailProject.exceptions;

/**
 *
 * @author tcasey
 */
public class PlayControlException extends Exception {

    public PlayControlException() {
    }

    public PlayControlException(String message) {
        super(message);
    }

    public PlayControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayControlException(Throwable cause) {
        super(cause);
    }

    public PlayControlException(String message, Throwable cause,
                                                boolean enableSuppression,
                                                boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
