package project.pkg1;
import java.util.Scanner;

public class getUsername {
    //initalising global variables
    static String username = null;
    static String loadUsername = "";

//fucntion to get username which is used in main
    public static String getUsername() throws InterruptedException {
            //initalising variables
            boolean hasNumberOrSymbol = true;
            Scanner scan = new Scanner(System.in);
            
            //to get correct user input
            while (hasNumberOrSymbol || username.length() > 10) {
                if(loadUsername.isEmpty()){
                    System.out.println("Please enter your name (maximum 10 characters): ");
                    username = scan.nextLine();
                    //to break loop next run
                    hasNumberOrSymbol = false;
                    //checking if input is letters
                    for (int i = 0; i < username.length(); i++) {
                        if (!Character.isLetter(username.charAt(i))) {
                            hasNumberOrSymbol = true;
                            break;
                        }
                    }
                    //checking for symbols
                    if (hasNumberOrSymbol) {
                        System.out.println("\u001B[31mPlease don't include numbers or special characters. Thank you :)\n\u001B[0m");
                        continue;
                    }
                    //checking if length is more than max
                    if (username.length() > 10) {
                        System.out.println("\u001B[31mPlease a name within 10 characters. Thank you :)\n\u001B[0m");
                        continue;
                    }
                    return username;
                } else {
  
                    System.out.print("                                    Loading");
                    for (int i = 0; i < 3; i++, Thread.sleep(1000), System.out.print(".")) ;
                    System.out.println();

                    System.out.print("\n                               Finding your pet");
                    for (int i = 0; i < 3; i++, Thread.sleep(800), System.out.print(".")) ;
                    System.out.println("");

                    System.out.print("\n                               Chasing your pet");
                    for (int i = 0; i < 3; i++, Thread.sleep(800), System.out.print(".")) ;
                    System.out.println("");

                    System.out.println("\n                                    CAPTURED!");
                    
                    System.out.println("\nWelcome "+Main.finalUsername);
                    
                    return loadUsername;
                     
                }
            }
            return username;
    }
    //setting username
    public static void setUsername(String username){
        loadUsername = username;
    }
    //returning username
    public static String username() {
        return username;
    }
}
