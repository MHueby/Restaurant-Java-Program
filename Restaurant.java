public class Restaurant {
    // Properties
    int waitTime;
    double rating;
    double avgPrice;
    double distance;
    String hoursOpen;
        // private datatype? menuItems;

    // Constructor
    public Restaurant() {}

    public Restaurant(int waitTime, double rating, double avgPrice, double distance, String hoursOpen) {
        this.waitTime = waitTime;
        this.rating = rating;
        this.avgPrice = avgPrice;
        this.distance = distance;
        this.hoursOpen = hoursOpen;
    }

}
