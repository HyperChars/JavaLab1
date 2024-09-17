public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "1HGBH41JXMN109186", "ABC123", "2021-01-01", 15000);
        Renter renter = new Renter("John", "Doe", "ID123456", "DL78910");

        Rental rental = new Rental.Builder()
                .setCar(car)
                .setRenter(renter)
                .setPickupLocation("Kyiv")
                .setDropoffLocation("Lviv")
                .setStartDate("2024-09-18")
                .setEndDate("2024-09-25")
                .setPricePerDay(50.0)
                .setTotalPrice(350.0)
                .build();

        System.out.println(rental);
    }
}
