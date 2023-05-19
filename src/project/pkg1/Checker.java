package project.pkg1;
public class Checker {
    public static int checkCap(int number){

       // Check if the input integer is greater than 100
    if(number > 100) {
        // If it is greater than 100, set the number to 100
        number = 100;
    }

    // Return the number, either the original or 100 if it was greater than 100
    return number;
    }
}
