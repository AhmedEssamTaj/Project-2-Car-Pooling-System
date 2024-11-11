public class Car {
    private String code;
    private int maxCapacityPerTrip;
    private Route route;

    public Car(String code, int maxCapacityPerTrip, Route route) {
        this.code = code;
        this.maxCapacityPerTrip = maxCapacityPerTrip;
        this.route = route;
    }

    public Car (){

    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getMaxCapacityPerTrip() {
        return maxCapacityPerTrip;
    }

    public void setMaxCapacityPerTrip(int maxCapacityPerTrip) {
        this.maxCapacityPerTrip = maxCapacityPerTrip;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }



}
