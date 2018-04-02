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
public class ReportControlException extends Exception {

    public ReportControlException() {
    }

    public ReportControlException(String message) {
        super(message);
    }

    public ReportControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReportControlException(Throwable cause) {
        super(cause);
    }

    public ReportControlException(String message, Throwable cause,
            boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
