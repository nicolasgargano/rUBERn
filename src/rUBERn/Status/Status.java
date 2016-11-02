package rUBERn.Status;

import rUBERn.Exceptions.AlreadyInStatusException;
import rUBERn.Exceptions.InvalidStatusChangeException;

/**
 * Created by facundo on 10/21/16.
 */
public interface Status {
    void goOnline();
    void goOffline() throws AlreadyInStatusException, InvalidStatusChangeException;
    void goWorking() throws InvalidStatusChangeException, AlreadyInStatusException;
    boolean isAvailableForJob();
    boolean isWorking();
    boolean isOnline();
    String toString();
}
