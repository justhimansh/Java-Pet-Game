package project.pkg1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

import java.util.Scanner;

public class Main {
    public static String username = null;
    public static String finalUsername = null;
    static Scanner scan = new Scanner(System.in);
    static String loadSpecies = "";
    static String loadPetName = "";
    public static HashMap<Integer, String> type = new HashMap<Integer, String>();

    public static void main(String[] args) throws InterruptedException {
        //load or create new game with num
        int num = readIntFromUser("              To load a game press \"1\"\n"+"             To create a game press \"2\"\n");
        //create the intro banner 
        introBanner intro = new introBanner();
        intro.introBanner();
     
        //getting the username through the getusername function 
        username = getUsername.getUsername();
        //saving username so other classes can access
        finalUsername = username;
        //choosing pet 
        int chosen = choosePet();
        givenSpecies(chosen);
    }
    public static int choosePet(){
        int chosen = 0;
            //array of pets
            String[] animals = {"Dog", "Cats", "Birds", "Fishes", "Insects", "Horse"};
            int index = Arrays.asList(animals).indexOf(loadSpecies);

            if(index >= 0){
                return index+1;
            } else {
                System.out.println("Choose a pet: ");
                for(int i = 0; i < animals.length; i++){
                    //putting into hashmap
                    System.out.println(i+1 +"."+ animals[i]);
                    type.put(i, animals[i]);
                }
                //error handling if user enters an invalid input
                try{
                    chosen = scan.nextInt();
                } catch (InputMismatchException e){
                    scan.nextLine();
                }
                return chosen;
            }
    }
    //creating the game display
    public static void givenSpecies(int chosen) throws InterruptedException {
        Game display = new Game();
        //displaying the chosen pet info
        display.displayPetInfo(chosen);
    }
    //function to load file and error handling
    public static String loadFile(String fileName) {
        
        StringBuilder fileContent = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                fileContent.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while loading the file: " + e.getMessage());
        }
        return fileContent.toString();
    }
    //displaying the user information and readnig the file to put the values into variables
    public static void displayUserInfoFromFile(String fileName) {
        String fileContent = loadFile(fileName);
        int usernameStartIndex = fileContent.indexOf(":") + 2;
        int usernameEndIndex = fileContent.indexOf("Pet Name:") - 1;
        String username = fileContent.substring(usernameStartIndex, usernameEndIndex);
        int petNameStartIndex = fileContent.indexOf("Pet Name:") + 10;
        int petNameEndIndex = fileContent.indexOf("Species:") - 1;
        String petName = fileContent.substring(petNameStartIndex, petNameEndIndex);
        int speciesStartIndex = fileContent.indexOf("Species:") + 9;
        String species = fileContent.substring(speciesStartIndex);
        
        finalUsername = username;
        loadUsername(username);
        getUsername.setUsername(username);
        loadPet(petName);
        loadPetName = petName;
        loadSpecies(species);
    }

    //single purpose functions 
    public static String loadUsername(String username){
        return username;
    }
    //single purpose functions 
    public static String loadPet(String petName){
        return petName;
    }
    //single purpose functions 
    public static void loadSpecies(String species){
        loadSpecies = species;
    }

    //getting user input to create or load game
    public static int getInput(){
        int input = 0;
        System.out.println("Press 1 to load game and 2 to create new game!");
        //error handling
        try{
            input = scan.nextInt();
            return input;
        } catch (InputMismatchException e){
            System.out.println("Please enter a valid number");
            input = scan.nextInt();
        }
        return input;
    }
    
    //reading the integer from the user and using displayuserinfo to read the file
    public static int readIntFromUser(String message) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(message);
    int num;
    while (true) {
        if (!scanner.hasNextInt()) {
            System.out.print("Invalid input. \n" + message);
            scanner.nextLine(); // consume the invalid input
        } else {
            num = scanner.nextInt();
            if (num == 1 || num == 2) {
                break;
            } else {
                System.out.print("Invalid input. \n" + message);
            }
        }
    }
    //load game
    if (num == 1) {
        //error handling
        try {
            displayUserInfoFromFile("output.txt");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\n                            You have no saved data :(");
        }
    } //create new game
    else if (num == 2) {
        //error handling 
        try {
            FileWriter fw = new FileWriter("output.txt", false);
            fw.write("");
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    return num;
}

}