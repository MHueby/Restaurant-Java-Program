public class Main {
    public static void main(String[] args) {

        Restaurant mcDonalds = new Restaurant(30, 2.0, 6.3, 2.0, "5:00am - 12:00am");
        Restaurant chipotle = new Restaurant(30,3.0, 14.8, 5, "9:00am - 10:00pm");

        System.out.println(chipotle.waitTime);
        System.out.println(chipotle.rating);
        System.out.println(chipotle.avgPrice);
        System.out.println(chipotle.distance);
        System.out.println(chipotle.hoursOpen);
    }
}
