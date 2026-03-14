# Restaurant

## Scanning Restaurant Data Text File
- Added formatted Restaurant.txt file to project
- Learned how to set a delimiter to a scanner object, and set the delimiter to ","

## New Methods to reduce code in the main method
- Used JavaDoc comments to indicate purpose, paramaters, and throws above methods
### Created scanRestaurantFile method
- Passed through the ArrayList under alias of list 
- Used a while loop to scan text file for next restaurant, and instantiate Restaurant objects from the data
- Used an if statement to correct faulty data in the file, where the rating was higher than 5, and set it to -1
- Throws a FileNotFoundException to the main method
### Created printRandomRestaurant method
- Passed through the ArrayList under alias of list
- Defined size of the ArrayList
- Created random object and created a random index to select a random restaurant from the ArrayList
	- Subtracted 1 from the ArrayList in the range for randIndex to comply with 0 based counting

## Throw FileNotFoundException
- Threw FileNotFoundException to main method from scanRestaurantFile
- used a try and catch to manage exception and 
- Use the to.String() function to define how calling a restaurant looks when it is printed to the console
- to.String() shows each variable of the Restaurant printed with the value given by the user input from the JOptionpane

## Array List
- Imported and instantiated an array list
