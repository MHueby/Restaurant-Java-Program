import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        // Instantiate an ArrayList to hold Restaurant Objects
        ArrayList<Restaurant> restaurantList = new ArrayList<>();


        // Take user input using JOption pane and store in variables
        String name = JOptionPane.showInputDialog("Enter the name of the restaurant: ");
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("Enter the wait time in minutes of the restaurant as a whole number (example 15): "));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("Enter the rating of the restaurant with a decimal between 0.0 and 5.0 (example 4.2): "));
        double avgPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter the average price of the restaurant in dollars with a decimal (example 12.50): "));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter the distance of the restaurant in miles with a decimal (example 6.7): "));
        String hoursOpen = JOptionPane.showInputDialog("Enter the hours the restaurant is open (example 09:00am - 08:00pm): ");

        // Instantiate restaurant object with those variables
        Restaurant userRestaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);
        System.out.println(userRestaurant);

        // Add the User's Restaurant Object to the array list
        restaurantList.add(userRestaurant);
        }
    }
