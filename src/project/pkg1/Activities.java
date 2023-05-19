package project.pkg1;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Activities extends petDirectory {
    static Random rand = new Random();
    static int[] variables = {100, 100};
    static int[] empty = {0, 0};

    // This method takes an integer input representing the selected activity and returns the resulting change in the pet's energy and hunger levels
public static int[] selectActivity(int input) {

    // Switch statement to determine which activity was selected
    switch (input) {
        case 1:
            // Call the Exercise method
            return Exercise();

        case 2:
            // Call the Feed method
            return Feed();

        case 3:
            // Call the Sleep method
            return Sleep();

        case 4:
            // Return the current energy and hunger levels
            return variables;
        case 5:
            // Call the endGame method
            return endGame();
        case 6:
            // Return an empty array
            return empty;

    }
    // Return the current energy and hunger levels by default
    return variables;
}

// This method simulates the pet doing exercise and returns the resulting change in the pet's energy and hunger levels
public static int[] Exercise() {
    // Generate a random integer between 1 and 20
    int randomNum = rand.nextInt(20) + 1;

    // Set both elements of the variables array to the random integer
    for (int i = 0; i < variables.length; i++) {
        variables[i] = randomNum;
    }
    // Return the variables array
    return variables;
}

// This method simulates the pet being fed and returns the resulting change in the pet's energy and hunger levels
public static int[] Feed() {
    // Generate a random integer between 1 and 20
    int randomNum = rand.nextInt(20) + 1;

    // Set the first element of the variables array to 0 and the second element to the negative of the random integer
    variables[0] = 0;
    variables[1] = -randomNum;
    // Return the variables array
    return variables;

}

// This method simulates the pet sleeping and returns the resulting change in the pet's energy and hunger levels
public static int[] Sleep() {

    // Set the first element of the variables array to -50 and the second element to 0
    variables[0] = -50;
    variables[1] = 0;

    // Return the variables array
    return variables;

}

// This method ends the game and returns an array representing the current state of the pet's energy and hunger levels
public static int[] endGame() {
    // Create a new array with both elements set to 0
    int[] end = {0, 0};

    // Print a message to the console
    System.out.println("Thank you for playing");

    // Terminate the program
    System.exit(0);
    // Return the end array
    return end;
}



}
