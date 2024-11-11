public abstract class Passenger {

    private String name;
    private String id;
    private Car reservedCar;
    private double tripCoast;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Passenger() {

    }

    public void printInfo (){
        System.out.println("Passenger Name: " + name);
        System.out.println("Passenger ID: " + id);
        if (reservedCar != null) {
            System.out.println("Reserved Car Code: " + reservedCar.getCode());
            System.out.println("Route Price: " + reservedCar.getRoute().getTripPrice());
        }

    }

    public abstract void makeReservation (Car car);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCoast() {
        return tripCoast;
    }

    public void setTripCoast(double tripCoast) {
        this.tripCoast = tripCoast;
    }

}
