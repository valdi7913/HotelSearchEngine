package hotel_search_system.controllers;

import hotel_search_system.storage.databaseHelperMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class bookControllerTest {

    private databaseHelperMock DB;
    private loginController LOGIN;
    private bookController booker;
    private int roomId1 = 100;
    private int roomId2 = 101;
    private Date start = new Date(5000000);
    private Date end = new Date(6000000);



    @BeforeEach
    public void setUp() {
        DB = new databaseHelperMock();
        LOGIN = new loginController(DB);
        booker = new bookController(DB, LOGIN);
        LOGIN.login("ÍVMASKÍNAN", "geitin123");
    }

    @AfterEach
    public void tearDown() {
        DB = null;
        LOGIN = null;
        booker = null;
    }

    @Test
    void book() {


    }

    @Test
    void unbook() {
    }

    @Test
    void testUnbook() {


    }

    @Test
    void getAvailability1() {


        assertEquals(true, booker.getAvailability(roomId1,start,end));

    }


    @Test
    void getAvailability2() {


        assertEquals(true, booker.getAvailability(roomId2,start,end));

    }
}