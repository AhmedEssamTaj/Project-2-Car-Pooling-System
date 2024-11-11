public class Non_subscribers extends Passenger{

    private boolean discountCoupon;

    public Non_subscribers(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon = discountCoupon;
    }

    public Non_subscribers(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    public boolean isDiscountCoupon() {
        return discountCoupon;
    }

    public void setDiscountCoupon(boolean discountCoupon) {
        this.discountCoupon = discountCoupon;
    }

    @Override
    public void printInfo() {
        System.out.println("Passenger Name: " + super.getName());
        System.out.println("Passenger ID: " + super.getId());
        System.out.println("Passenger Type: Non-subscriber");
        System.out.println("has 10% Discount Coupon: " + discountCoupon);
        if (super.getReservedCar() != null) {
            System.out.println("Reserved Car Code: " + super.getReservedCar().getCode());
            System.out.println("car Route Price: " + super.getReservedCar().getRoute().getTripPrice());
            System.out.println("final trip coast for passenger "+this.getName()+" is: $"+this.getTripCoast());
        }
    }

    @Override
    public void makeReservation(Car car) {

        try {
            if (car.getMaxCapacityPerTrip() <= 0) {

                throw new IllegalArgumentException("Car (" + car.getCode() + ") reached maximum capacity..");

            } else {

                super.setReservedCar(car);

                if (discountCoupon) {
                    this.setTripCoast((double) Math.round((car.getRoute().getTripPrice() - (car.getRoute().getTripPrice() * 0.1)) * 100) / 100);
                } else {
                    this.setTripCoast(car.getRoute().getTripPrice());
                }

            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
