package hotel_search_system.storage;

import hotel_search_system.models.*;
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void book(int roomId, int personId, Date startDate, Date endDate) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void unbook(int bookingId) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Person login(String name, String password) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int logout(String name) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
