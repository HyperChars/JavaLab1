import java.util.Objects;

public class Rental {
    private Car car;
    private Renter renter;
    private String pickupLocation;
    private String dropoffLocation;
    private String startDate;
    private String endDate;
    private double pricePerDay;
    private double totalPrice;

    private Rental(Builder builder) {
        this.car = builder.car;
        this.renter = builder.renter;
        this.pickupLocation = builder.pickupLocation;
        this.dropoffLocation = builder.dropoffLocation;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.pricePerDay = builder.pricePerDay;
        this.totalPrice = builder.totalPrice;
    }

    public static class Builder {
        private Car car;
        private Renter renter;
        private String pickupLocation;
        private String dropoffLocation;
        private String startDate;
        private String endDate;
        private double pricePerDay;
        private double totalPrice;

        public Builder setCar(Car car) {
            this.car = car;
            return this;
        }

        public Builder setRenter(Renter renter) {
            this.renter = renter;
            return this;
        }

        public Builder setPickupLocation(String pickupLocation) {
            this.pickupLocation = pickupLocation;
            return this;
        }

        public Builder setDropoffLocation(String dropoffLocation) {
            this.dropoffLocation = dropoffLocation;
            return this;
        }

        public Builder setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setPricePerDay(double pricePerDay) {
            this.pricePerDay = pricePerDay;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Rental build() {
            return new Rental(this);
        }
    }

    @Override
    public String toString() {
        return "Rental{" +
                "car=" + car +
                ", renter=" + renter +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropoffLocation='" + dropoffLocation + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", totalPrice=" + totalPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return Double.compare(rental.pricePerDay, pricePerDay) == 0 && Double.compare(rental.totalPrice, totalPrice) == 0 && Objects.equals(car, rental.car) && Objects.equals(renter, rental.renter) && Objects.equals(pickupLocation, rental.pickupLocation) && Objects.equals(dropoffLocation, rental.dropoffLocation) && Objects.equals(startDate, rental.startDate) && Objects.equals(endDate, rental.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, renter, pickupLocation, dropoffLocation, startDate, endDate, pricePerDay, totalPrice);
    }
}
