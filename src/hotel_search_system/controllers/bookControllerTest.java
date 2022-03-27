package hotel_search_system.controllers;

import hotel_search_system.storage.databaseHelperMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class bookControllerTest {
    private databaseHelperMock DB;
    private loginController LOGIN;
    private bookController booker;
    private int roomId1 = 100;
    private int roomId2 = 101;
    private Date start1 = new Date();
    private Date start2 = new Date();
    private Date end1 = new Date();
    private Date end2 = new Date();



    @Before
    public void setUp() {
        databaseHelperMock DB = new databaseHelperMock();
        loginController LOGIN = new loginController(DB);
        bookController booker = new bookController(DB, LOGIN);
        LOGIN.login("ÍVMASKÍNAN", "geitin123");
    }
    @After
    public void tearDown() {
        databaseHelperMock DB = null;
        loginController LOGIN = null;
        bookController booker = null;
    }
    @Test
    public void testAvailability1() {
        assertEquals(true, booker.getAvailability(roomId1,start1,end1));
    }

    @Test
    public void testAvailability2() {
        assertEquals(false, booker.getAvailability(roomId2,start2,end2));
    }

    @Test
    public void testBook() {
        //assertEquals(, );
    }

    @Test
    public void testUnbook() {
        //assertEquals(, );
    }
}
