package hotel_search_system.models;

public class Customer extends Person{
   private Booking[] bookings;

   public Customer(String name, String password, int Id) {
      super(name, password, Id);
   }
}
    