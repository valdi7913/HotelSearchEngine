package hotel_search_system.controllers;

import hotel_search_system.models.Person;
import hotel_search_system.storage.DatabaseInterface;
import hotel_search_system.storage.databaseHelper;

public class loginController {

    private Person loggedIn = null;
    private DatabaseInterface db;

    public loginController(DatabaseInterface DB){
        this.db = DB;
    }

    public Person login(String name, String password){
        Person loginTry = db.login(name, password);
        this.loggedIn = loginTry;
        return loginTry;
    }

    public void logout(){
        this.loggedIn = null;
    }

    public boolean logged(int personID){
        return(loggedIn.getId()==personID);
    }
    public int getLogged(){
        return loggedIn.getId();
    }

}
