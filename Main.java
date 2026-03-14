import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            ArrayList<Restaurant> restaurants = new ArrayList<>();

            try {
                scanRestaurantFile(restaurants);
            }
            catch (FileNotFoundException e) {
                System.out.println(e);
            }
            printRandomRestaurant(restaurants);
    }

    /**
     * Scans formatted Restaurant.txt file and instantiates Restaurant objects into the ArrayList
     * @param list
     * @throws FileNotFoundException
     */
    public static void scanRestaurantFile(ArrayList<Restaurant> list) throws FileNotFoundException{
        File file = new File("src/formatted Restaurant.txt");
        Scanner scan = new Scanner(file);
        scan.useDelimiter(",");

        while (scan.hasNext()) {
            String name = scan.next();
            int waitTime = scan.nextInt();
            double rating = scan.nextDouble();
            double avgPrice = scan.nextDouble();
            double distance = scan.nextDouble();
            String hoursOpen = scan.next();

            if (rating > 5) {
                rating = -1;
            }

            Restaurant restaurant = new Restaurant(name, waitTime, rating, avgPrice, distance, hoursOpen);

            list.add(restaurant);

        }
        scan.close();
    }


    /**
     * Outputs a random restaurant from the ArrayList
     * @param list Arraylist of Restaurants
     */
    public static void printRandomRestaurant(ArrayList<Restaurant> list) {
            Random randy = new Random();
            int numRestaurants = list.size();
            int randIndex = randy.nextInt(numRestaurants - 1);
            System.out.println(list.get(randIndex));
        }
    }