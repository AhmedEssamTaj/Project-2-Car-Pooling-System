public class Subscribers extends Passenger{
    public Subscribers(String name, String id) {
        super(name, id);
    }

    public Subscribers() {
    }


    @Override
    public void printInfo() {
        System.out.println("Passenger Name: " + this.getName());
        System.out.println("Passenger ID: " + this.getId());
        System.out.println("Passenger Type: Subscriber,gets a 50% discount");
        if (this.getReservedCar() != null) {
            System.out.println("Reserved Car Code: " + this.getReservedCar().getCode());
            System.out.println("car Route Price: " + this.getReservedCar().getRoute().getTripPrice());
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

                this.setTripCoast((double) Math.round((car.getRoute().getTripPrice() - (car.getRoute().getTripPrice() * 0.5)) * 100) / 100);
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
