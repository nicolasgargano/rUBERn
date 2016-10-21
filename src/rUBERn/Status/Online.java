package rUBERn.Status;

import rUBERn.Driver;
import rUBERn.Exceptions.AlreadyInStatusException;

/**
 * Created by facundo on 10/21/16.
 */
public class Online implements Status {
    private Driver driver;
    public Online(Driver d){
        driver = d;
    }
    @Override
    public void goOnline() throws AlreadyInStatusException {
        throw new AlreadyInStatusException();
    }

    @Override
    public void goOffline() {
        driver.setStatus(new Offline(driver));
    }

    @Override
    public void goWorking() {
        driver.setStatus(new Working(driver));
    }
    public String toString(){
        return "Online";
    }
}