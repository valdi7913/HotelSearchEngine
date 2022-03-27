package hotel_search_system.storage;//package HotelSearchEngine.Storage;
import hotel_search_system.models.*;
import hotel_search_system.storage.DatabaseInterface;

import java.text.SimpleDateFormat;
import java.util.Date;

public class databaseHelperMock implements DatabaseInterface {

    @Override
    public void addReviews(Review review) {
        // TODO Auto-generated method stub

    }

    @Override
    public Review[] getHotelReviews(int hotelId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Room[] getHotelRooms(Restrictions restrictions) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Hotel[] getHotels(Restrictions restrictions) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getAvgRating(int hotelId) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void addHotel(Hotel hotel) {
        // TODO Auto-generated method stub

    }

    @Override
    public Booking[] getBookings(int roomId) {
        if(roomId==100){
            Booking[] bookings = {
                    new Booking(1,100,201,new Date(1000000), new Date(2000000)),
                    new Booking(2,100,202,new Date(3000000), new Date(4000000)),
                    new Booking(2,100,202,new Date(8000000), new Date(9000000)),
                    new Booking(2,100,202,new Date(10000000), new Date(11000000))
            };

            return bookings; //Breyta í einhver gögn
        }
        if(roomId==101){
            Booking[] bookings = {
                    new Booking(1,100,201,new Date(1000000), new Date(2000000)),
                    new Booking(2,100,202,new Date(3000000), new Date(4000000)),
                    new Booking(2,100,202,new Date(5500000), new Date(7000000)),
                    new Booking(2,100,202,new Date(10000000), new Date(11000000))
            };
            return bookings; //Breyta í einhver gögn
        }
        return null;
    }

    @Override
    public Booking book(int roomId, int personId, Date startDate, Date endDate) {
        Booking booking = new Booking(1, roomId, personId, startDate, endDate);
        return booking;
    }

    @Override
    public Booking unbook(int bookingId) {
        //Booking booking = new Booking();
        //return booking;
        return null;

    }

    @Override
    public Person login(String name, String password) {
        Person person = new Person(name, password, 1);
        return person;
    }

    @Override
    public int logout(String name) {
        // Þarf þess aðferð???
        return 0;
    }

}
