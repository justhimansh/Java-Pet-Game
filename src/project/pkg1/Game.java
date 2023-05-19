package project.pkg1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Game {
    //directory for all the pets
    private petDirectory directory = new petDirectory();
    private Random random = new Random();
    private Pets[] dogs = {directory.getMax(), directory.getKevin(), directory.getRay(), directory.getBean(), directory.getSky() };
    private Pets[] cats = {directory.getMaxine(), directory.getDory(), directory.getMoth(), directory.getWhite(), directory.getNugget()};

    private Pets[] horses = {directory.getMustang(), directory.getBrad(), directory.getClyde(), directory.getGoldie(), directory.getSpot()};

    private Pets[] insects = {directory.getAragogg(), directory.getHamada(), directory.getScarlet(), directory.getSandy(), directory.getDestin()};

    private Pets[] birds = {directory.getHarry(), directory.getMolly(), directory.getBetty(), directory.getMoon(), directory.getHawk()};

    private Pets[] fish = {directory.getBruce(), directory.getNemo(), directory.getBubbles(), directory.getGary(), directory.getFinley()};

    //scanner added
    Scanner scanner = new Scanner(System.in);

    //initalising global variables
    int choice;
    int selected = 1;

    int counter;
    String loadPet;

    //getting a random animals if the load is empty
    public Pets getRandomDog() {
        loadPet = Main.loadPetName;

        //System.out.println(loadPet);
        int newIndex = 0;
        if(loadPet == ""){
            int index = random.nextInt(dogs.length);
            return dogs[index];
        } else {
            for(int i = 0; i < dogs.length; i++){
                if(dogs[i].petName.equals(loadPet)){
                    newIndex = i;
                    return dogs[newIndex];
                }
            }
            return dogs[newIndex];
        }    }

    public Pets getRandomCat() {
        loadPet = Main.loadPetName;

        //System.out.println(loadPet);
        int newIndex = 0;
        if(loadPet == ""){
            int index = random.nextInt(cats.length);
            return cats[index];
        } else {
            for(int i = 0; i < cats.length; i++){
                if(cats[i].petName.equals(loadPet)){
                    newIndex = i;
                    return cats[newIndex];
                }
            }
            return cats[newIndex];
        }
    }

    public Pets getRandomBird() {
        loadPet = Main.loadPetName;

        //System.out.println(loadPet);
        int newIndex = 0;
        if(loadPet == ""){
            int index = random.nextInt(birds.length);
            return birds[index];
        } else {
            for(int i = 0; i < birds.length; i++){
                if(birds[i].petName.equals(loadPet)){
                    newIndex = i;
                    return birds[newIndex];
                }
            }
            return birds[newIndex];
        }
    }

    public Pets getRandomHorse() {
        loadPet = Main.loadPetName;

        //System.out.println(loadPet);
        int newIndex = 0;
        if(loadPet == ""){
            int index = random.nextInt(horses.length);
            return horses[index];
        } else {
            for(int i = 0; i < cats.length; i++){
                if(cats[i].petName.equals(loadPet)){
                    newIndex = i;
                    return horses[newIndex];
                }
            }
            return horses[newIndex];
        }
    }
    public Pets getRandomInsect() {
        loadPet = Main.loadPetName;
        //System.out.println(loadPet);
        int newIndex = 0;
        if(loadPet == ""){
            int index = random.nextInt(insects.length);

            return insects[index];
        } else {
            for(int i = 0; i < insects.length; i++){
                if(insects[i].petName.equals(loadPet)){
                    newIndex = i;
                    return insects[newIndex];
                }
            }
            return insects[newIndex];
        }
    }

    public Pets getRandomFish() {
        loadPet = Main.loadPetName;
        //System.out.println(loadPet);
        int newIndex = 0;
        if(loadPet == ""){
            int index = random.nextInt(fish.length);
            return fish[index];
        } else {
            for(int i = 0; i < fish.length; i++){
                if(fish[i].petName.equals(loadPet)){
                    newIndex = i;
                    return fish[newIndex];
                }
            }
            return fish[newIndex];
        }
    }
    //displaying the pet info
    public void displayPetInfo(int chosen) throws InterruptedException {
        this.choice = chosen;
        //error handling
        while (choice < 1 || choice > 6) {
            System.out.println("Please choose a number between 1-6:");
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                // Catch any non-integer input
                scanner.nextLine(); // clear the scanner buffer
            }
        }
        //switch case to choose what pet is wanted by the user as well as creating a banner
        switch (choice) {
            case 1:
                Pets randomDog = getRandomDog();
                Dogs dog = (Dogs) randomDog;
                dogBanner(dog, dog.getEnergy(), dog.getFood());
                break;

            case 2:
                Pets randomCat = getRandomCat();
                Cats cat = (Cats) randomCat;
                catBanner(cat, cat.getEnergy(), cat.getFood());
                break;

            case 3:
                Pets randomBird = getRandomBird();
                Birds bird = (Birds) randomBird;
                birdBanner(bird, bird.getEnergy(), bird.getFood());
                break;

            case 4:
                Pets randomFish = getRandomFish();
                Fish fish = (Fish) randomFish;
                fishBanner(fish, fish.getEnergy(), fish.getFood());
                break;

            case 5:
                Pets randomInsect = getRandomInsect();
                Insects insect = (Insects) randomInsect;
                insectBanner(insect, insect.getEnergy(), insect.getFood());
                break;

            case 6:
                Pets randomHorse = getRandomHorse();
                Horses horse = (Horses) randomHorse;
                horseBanner(horse, horse.getEnergy(), horse.getFood());
                break;
        }
    }

    //creating a dog banner
    public void dogBanner(Dogs dog, int energy, int hunger) {
        int input;
        int[] stats = {0, 0};
        //to cap it at 100
        energy = Checker.checkCap(energy);
        hunger = Checker.checkCap(hunger);

        for (int i = 0; i < Activities.selectActivity(selected).length; i++) {
            stats[i] = Activities.selectActivity(selected)[i];
        }

        // Calculate new energy and hunger stats after performing an activity
        int newEnergy = energy - stats[0];
        int newHunger = hunger - stats[1];

        // Check if new energy and hunger are above 100
        if(counter == 0){
            newEnergy = 100;
            newHunger = 100;
        } else {
            newEnergy -= stats[0];
            newHunger -= stats[1];
        }
        
        this.counter++;

        newHunger = Checker.checkCap(newHunger);
        newEnergy = Checker.checkCap(newEnergy);

        System.out.print(Colors.colorList.get(1)+"+===============================================================================");
        System.out.print(Colors.colorList.get(1)+"\n  \uD83D\uDD38 : "+dog.getSpeciesRarity()+"                         \uD83D\uDC51"+dog.petName.toUpperCase()+"\uD83D\uDC51                      \u26A1: "  +newEnergy);
        System.out.print(Colors.colorList.get(1)+"\n  \u26A5  : "+dog.getSpeciesBreed()+"                  U・ᴥ・U                       \u2764: " + newHunger);
        System.out.print(Colors.colorList.get(1)+"\n+                                                                              +\n");
        System.out.print(Colors.colorList.get(1)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
        System.out.print(Colors.colorList.get(1)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
        System.out.print(Colors.colorList.get(1)+"\n+                              Press '5' to exit!                              +\n");
        System.out.print(Colors.colorList.get(1)+"+===============================================================================\n"+Colors.colorList.get(0));

        //to show stats
        if(selected == 4 ) {
            System.out.print(Colors.colorList.get(1)+"+===============================================================================+");
            System.out.print(Colors.colorList.get(1)+"\n  \uD83D\uDD38 : " +dog.getSpeciesRarity() + "                         \uD83D\uDC51" + dog.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
            System.out.print(Colors.colorList.get(1)+"\n  \u26A5  : " + dog.getSpeciesBreed() + "                      U・ᴥ・U                            \u2764: " + newHunger);
            System.out.print(Colors.colorList.get(1)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(1)+"\n+                           SHOWING STATS:                                +\n");
            System.out.print(Colors.colorList.get(1)+"\nSpecies: " + dog.getSpeciesName() + "       |          Trait: " + dog.getTrait() + "      |      Food Group:  " + dog.getFoodGroup() + "   +\n");
            System.out.print(Colors.colorList.get(1)+"\nSound: " + dog.getSpeciesSound() + "      |          Colorblind: " + dog.colorblind() + "         | Breed: " + dog.getSpeciesBreed() + "       +\n");
            System.out.print(Colors.colorList.get(1)+"\nAge: " + dog.getAge() + "        |         Bite Strength: " + dog.getBiteStrength() + "         |       Sence of Smell: " + dog.getSenseOfSmell() + " +\n");
            System.out.print(Colors.colorList.get(1)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(1)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
            System.out.print(Colors.colorList.get(1)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
            System.out.print(Colors.colorList.get(1)+"+===============================================================================\n"+Colors.colorList.get(0));
            //input error handling to stop loop after the user inputs 4
            while (true) {
                try {
                    selected = scanner.nextInt();
                    break; // break the loop if the input is valid
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter a valid number: ");
                    scanner.nextLine(); // consume the invalid input
                }
            }
            //more error handling to make sure user doesn't input an invalid numeber (<1 || > 5) or string
        }else {
            while (!scanner.hasNextInt() || (selected = scanner.nextInt()) < 1 || selected > 5) {
                System.out.print("Invalid input. \n");
                scanner.nextLine(); // consume the invalid input
            }
        }

        //saving game
        String output = ("Name: "+Main.finalUsername+"\nPet Name: "+dog.getPetName()+"\nSpecies: "+dog.getSpeciesName());
        saveGame(output);

        //recusion 
        dogBanner(dog, newEnergy, newHunger);
    }
    //creating cat banenr
    public void catBanner(Cats cat, int energy, int hunger) {
        int input;
        int[] stats = {0, 0};
        //making values cap at 100
        hunger = Checker.checkCap(hunger);
        energy = Checker.checkCap(energy);

        //selecting the activity
        for (int i = 0; i < Activities.selectActivity(selected).length; i++) {
            stats[i] = Activities.selectActivity(selected)[i];
        }

        // Calculate new energy and hunger stats after performing an activity
        int newEnergy = energy - stats[0];
        int newHunger = hunger - stats[1];

        // Check if new energy and hunger are above 100
        if(counter == 0){
            newEnergy = 100;
            newHunger = 100;
        } else {
            newEnergy -= stats[0];
            newHunger -= stats[1];
        }
        counter++;

        newEnergy = Checker.checkCap(newEnergy);
        newHunger = Checker.checkCap(newHunger);

        //creating cat banner
        System.out.print(Colors.colorList.get(2)+"+===============================================================================");
        System.out.print(Colors.colorList.get(2)+"\n  \uD83D\uDD38 : "+cat.getSpeciesRarity()+"                         \uD83D\uDC51"+cat.petName.toUpperCase()+"\uD83D\uDC51                      \u26A1: "  +newEnergy);
        System.out.print(Colors.colorList.get(2)+"\n  \u26A5  : "+cat.getSpeciesBreed()+"                  =^._.^= ∫                       \u2764: " + newHunger);
        System.out.print(Colors.colorList.get(2)+"\n+                                                                              +\n");
        System.out.print(Colors.colorList.get(2)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
        System.out.print(Colors.colorList.get(2)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
        System.out.print(Colors.colorList.get(2)+"\n+                              Press '5' to exit!                              +\n");
        System.out.print(Colors.colorList.get(2)+"+===============================================================================\n"+Colors.colorList.get(0));

        if(selected == 4 ) {
            //System.out.println("You've Chosen: " + choice + "!");
            System.out.print(Colors.colorList.get(2)+"+===============================================================================+");
            System.out.print(Colors.colorList.get(2)+"\n  \uD83D\uDD38 : " +cat.getSpeciesRarity() + "                         \uD83D\uDC51" + cat.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
            System.out.print(Colors.colorList.get(2)+"\n  \u26A5  : " + cat.getSpeciesBreed() + "                   =^._.^= ∫                         \u2764: " + newHunger);
            System.out.print(Colors.colorList.get(2)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(2)+"\n+                           SHOWING STATS:                                +\n");
            System.out.print(Colors.colorList.get(2)+"\nSpecies: " + cat.getSpeciesName() + "       |          Trait: " + cat.getTrait() + "      |      Food Group:  " + cat.getFoodGroup() + "   +\n");
            System.out.print(Colors.colorList.get(2)+"\nSound: " + cat.getSpeciesSound() + "      |          Color: " + cat.getColor() + "         | Breed: " + cat.getSpeciesBreed() + "       +\n");
            System.out.print(Colors.colorList.get(2)+"\nAge: " + cat.getAge() + "        |         Claws: " + cat.HasClaws() + "         |       Night Vision: " + cat.getNightVision() + " +\n");
            System.out.print(Colors.colorList.get(2)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(2)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
            System.out.print(Colors.colorList.get(2)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
            System.out.print(Colors.colorList.get(2)+"+===============================================================================\n"+Colors.colorList.get(0));
            while (true) {
                try {
                    selected = scanner.nextInt();
                    break; // break the loop if the input is valid
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter a valid number: ");
                    scanner.nextLine(); // consume the invalid input
                }
            }
        }else{
            while (!scanner.hasNextInt() || (selected = scanner.nextInt()) < 1 || selected > 5) {
                System.out.print("Invalid input. \n");
                scanner.nextLine(); // consume the invalid input
            }
        }
        // need counter + capCHECK for new hunger and new energy
        String output = ("Name: "+Main.finalUsername+"\nPet Name: "+cat.getPetName()+"\nSpecies: "+cat.getSpeciesName());
        saveGame(output);
        catBanner(cat, newEnergy, newHunger);
    }

    public void birdBanner(Birds bird, int energy, int hunger) {
        int input;
        int[] stats = {0, 0};

        // Check if energy and hunger are above 100
        hunger = Checker.checkCap(hunger);
        energy = Checker.checkCap(energy);
        
        for (int i = 0; i < Activities.selectActivity(selected).length; i++) {
            stats[i] = Activities.selectActivity(selected)[i];
        }

        // Calculate new energy and hunger stats after performing an activity
        int newEnergy = energy - stats[0];
        int newHunger = hunger - stats[1];

        // Check if new energy and hunger are above 100
        if(counter == 0){
            newEnergy = 100;
            newHunger = 100;
        } else {
            newEnergy -= stats[0];
            newHunger -= stats[1];
        }
        counter++;

        newEnergy = Checker.checkCap(newEnergy);
        newHunger = Checker.checkCap(newHunger);

        System.out.print(Colors.colorList.get(3)+"+===============================================================================");
        System.out.print(Colors.colorList.get(3)+"\n  \uD83D\uDD38 : " + bird.getSpeciesRarity() + "                         \uD83D\uDC51" + bird.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
        System.out.print(Colors.colorList.get(3)+"\n  \u26A5  : " + bird.getSpeciesBreed() + "                  乁[ᓀ˵▾˵ᓂ]ㄏ                       \u2764: " + newHunger);
        System.out.print(Colors.colorList.get(3)+"\n+                                                                              +\n");
        System.out.print(Colors.colorList.get(3)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
        System.out.print(Colors.colorList.get(3)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
        System.out.print(Colors.colorList.get(3)+"\n+                              Press '5' to exit!                              +\n");
        System.out.print(Colors.colorList.get(3)+"+===============================================================================\n"+Colors.colorList.get(0));

        if(selected == 4 ) {
            System.out.print(Colors.colorList.get(3)+"+===============================================================================+");
            System.out.print(Colors.colorList.get(3)+"\n  \uD83D\uDD38 : " +bird.getSpeciesRarity() + "                         \uD83D\uDC51" + bird.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
            System.out.print(Colors.colorList.get(3)+"\n  \u26A5  : " + bird.getSpeciesBreed() + "                   乁[ᓀ˵▾˵ᓂ]ㄏ                         \u2764: " + newHunger);
            System.out.print(Colors.colorList.get(3)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(3)+"\n+                           SHOWING STATS:                                +\n");
            System.out.print(Colors.colorList.get(3)+"\nSpecies: " + bird.getSpeciesName() + "       |          Trait: " + bird.getTrait() + "      |      Food Group:  " + bird.getFoodGroup() + "   +\n");
            System.out.print(Colors.colorList.get(3)+"\nSound: " + bird.getSpeciesSound() + "      |          Wing Span: " + bird.getWingsSpan() + "         | Breed: " + bird.getSpeciesBreed() + "       +\n");
            System.out.print(Colors.colorList.get(3)+"\nAge: " + bird.getAge() + "        |         Flight: " + bird.getFlight() + "         |       Flying Speed: " + bird.getFlyingSpeed() + " +\n");
            System.out.print(Colors.colorList.get(3)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(3)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
            System.out.print(Colors.colorList.get(3)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
            System.out.print(Colors.colorList.get(3)+"+===============================================================================\n"+Colors.colorList.get(0));
            while (true) {
                try {
                    selected = scanner.nextInt();
                    break; // break the loop if the input is valid
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter a valid number: ");
                    scanner.nextLine(); // consume the invalid input
                }
            }

        } else{
            while (!scanner.hasNextInt() || (selected = scanner.nextInt()) < 1 || selected > 5) {
                System.out.print("Invalid input. \n");
                scanner.nextLine(); // consume the invalid input
            }
        }

        String output = ("Name: "+Main.finalUsername+"\nPet Name: "+bird.getPetName()+"\nSpecies: "+bird.getSpeciesName());
        saveGame(output);
        birdBanner(bird, newEnergy, newHunger);
    }

    public void fishBanner(Fish fish, int energy, int hunger) {
        int input;
        int[] stats = {0, 0};

        hunger = Checker.checkCap(hunger);
        energy = Checker.checkCap(energy);

        for (int i = 0; i < Activities.selectActivity(selected).length; i++) {
            stats[i] = Activities.selectActivity(selected)[i];
        }

        int newEnergy = energy - stats[0];
        int newHunger = hunger - stats[1];

        if (counter == 0) {
            newEnergy = 100;
            newHunger = 100;
        } else {
            newEnergy -= stats[0];
            newHunger -= stats[1];
        }
        this.counter++;

        newHunger = Checker.checkCap(newHunger);
        newEnergy = Checker.checkCap(newEnergy);

        System.out.print(Colors.colorList.get(4)+"+===============================================================================");
        System.out.print(Colors.colorList.get(4)+"\n  \uD83D\uDD38 : " + fish.getSpeciesRarity() + "                         \uD83D\uDC51" + fish.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
        System.out.print(Colors.colorList.get(4)+"\n  \u26A5  : " + fish.getSpeciesBreed() + "                ~(=^･ω･^)ﾍ >ﾟ)))彡                      \u2764: " + newHunger);
        System.out.print(Colors.colorList.get(4)+"\n+                                                                              +\n");
        System.out.print(Colors.colorList.get(4)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
        System.out.print(Colors.colorList.get(4)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
        System.out.print(Colors.colorList.get(4)+"\n+                              Press '5' to exit!                              +\n");
        System.out.print(Colors.colorList.get(4)+"+===============================================================================\n"+Colors.colorList.get(0));

        if(selected == 4 ) {
            System.out.print(Colors.colorList.get(4)+"+===============================================================================+");
            System.out.print(Colors.colorList.get(4)+"\n  \uD83D\uDD38 : " + fish.getSpeciesRarity() + "                         \uD83D\uDC51" + fish.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
            System.out.print(Colors.colorList.get(4)+"\n  \u26A5  : " + fish.getSpeciesBreed() + "                 ~(=^･ω･^)ﾍ >ﾟ)))彡                       \u2764: " + newHunger);
            System.out.print(Colors.colorList.get(4)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(4)+"\n+                           SHOWING STATS:                                +\n");
            System.out.print(Colors.colorList.get(4)+"\nSpecies: " + fish.getSpeciesName() + "       |          Trait: " + fish.getTrait() + "      |      Food Group:  " + fish.getFoodGroup() + "   +\n");
            System.out.print(Colors.colorList.get(4)+"\nSound: " + fish.getSpeciesSound() + "      |          Scale Type: " + fish.getScaleType() + "         | Water Level : " + fish.getWaterLevel() + "       +\n");
            System.out.print(Colors.colorList.get(4)+"\nAge: " + fish.getAge() + "        |         Type: " + fish.getLocation() + "         |        Rarity: " + fish.getSpeciesRarity() + " +\n");
            System.out.print(Colors.colorList.get(4)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(4)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
            System.out.print(Colors.colorList.get(4)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
            System.out.print(Colors.colorList.get(4)+"+===============================================================================\n"+Colors.colorList.get(0));

            while (true) {
                try {
                    selected = scanner.nextInt();
                    break; // break the loop if the input is valid
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter a valid number: ");
                    scanner.nextLine(); // consume the invalid input
                }
            }
        } else{
            while (!scanner.hasNextInt() || (selected = scanner.nextInt()) < 1 || selected > 5) {
                System.out.print("Invalid input. \n");
                scanner.nextLine(); // consume the invalid input
            }
        }

        String output = ("Name: "+Main.finalUsername+"\nPet Name: "+fish.getPetName()+"\nSpecies: "+fish.getSpeciesName());
        saveGame(output);
        fishBanner(fish, newEnergy, newHunger);
    }

    public void insectBanner(Insects insect, int energy, int hunger) {
        int input;
        int[] stats = {0, 0};
        
        hunger = Checker.checkCap(hunger);
        energy = Checker.checkCap(energy);

        for (int i = 0; i < Activities.selectActivity(selected).length; i++) {
            stats[i] = Activities.selectActivity(selected)[i];
        }
        
        int newEnergy = energy - stats[0];
        int newHunger = hunger - stats[1];

        if (counter == 0) {
            newEnergy = 100;
            newHunger = 100;
        } else {
            newEnergy -= stats[0];
            newHunger -= stats[1];
        }
        counter++;
        
        newEnergy = Checker.checkCap(newEnergy);
        newHunger = Checker.checkCap(newHunger);

            System.out.print(Colors.colorList.get(5) + "+===============================================================================");
            System.out.print(Colors.colorList.get(5) +"\n  \uD83D\uDD38 : " + insect.getSpeciesRarity() + "                         \uD83D\uDC51" + insect.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
            System.out.print(Colors.colorList.get(5) +"\n  \u26A5  : " + insect.getSpeciesBreed() + "                     Ƹ̵̡Ӝ̵̨̄Ʒ                          \u2764: " + newHunger);
            System.out.print(Colors.colorList.get(5) +"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(5) +"\n+                           CHOOSE AN ACTIVITY:                                +\n");
            System.out.print(Colors.colorList.get(5) +"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
            System.out.print(Colors.colorList.get(5) +"\n+                              Press '5' to exit!                              +\n");
            System.out.print(Colors.colorList.get(5) +"+===============================================================================\n" + Colors.colorList.get(0));

            if (selected == 4) {
                System.out.print(Colors.colorList.get(5) + "+===============================================================================+");
                System.out.print(Colors.colorList.get(5) +"\n  \uD83D\uDD38 : " + insect.getSpeciesRarity() + "                         \uD83D\uDC51" + insect.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
                System.out.print(Colors.colorList.get(5) +"\n  \u26A5  : " + insect.getSpeciesBreed() + "                     Ƹ̵̡Ӝ̵̨̄Ʒ                           \u2764: " + newHunger);
                System.out.print(Colors.colorList.get(5) +"\n+                                                                              +\n");
                System.out.print(Colors.colorList.get(5) +"\n+                           SHOWING STATS:                                +\n");
                System.out.print(Colors.colorList.get(5) +"\nSpecies: " + insect.getSpeciesName() + "       |          Trait: " + insect.getTrait() + "      |      Food Group:  " + insect.getFoodGroup() + "   +\n");
                System.out.print(Colors.colorList.get(5) +"\nSound: " + insect.getSpeciesSound() + "      |          Venomous: " + insect.isIsVenomous() + "         | Speed: " + insect.Legs() + "       +\n");
                System.out.print(Colors.colorList.get(5) +"\nAge: " + insect.getAge() + "        |         Eyes: " + insect.Eyes() + "         |        Type: " + insect.getSpeciesBreed() + " +\n");
                System.out.print(Colors.colorList.get(5) +"\n+                                                                              +\n");
                System.out.print(Colors.colorList.get(5) +"\n+                           CHOOSE AN ACTIVITY:                                +\n");
                System.out.print(Colors.colorList.get(5) +"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
                System.out.print(Colors.colorList.get(5) +"+===============================================================================\n" + Colors.colorList.get(0));
                while (true) {
                    try {
                        selected = scanner.nextInt();
                        break; // break the loop if the input is valid
                    } catch (InputMismatchException e) {
                        System.out.print("Invalid input. Please enter a valid number: ");
                        scanner.nextLine(); // consume the invalid input
                    }
                }
            } else{
                while (!scanner.hasNextInt() || (selected = scanner.nextInt()) < 1 || selected > 5) {
                    System.out.print("Invalid input. \n");
                    scanner.nextLine(); // consume the invalid input
                }
            }
        String output = ("Name: " + Main.finalUsername + "\nPet Name: " + insect.getPetName() + "\nSpecies: " + insect.getSpeciesName());
        this.counter++;
        saveGame(output);
        insectBanner(insect, newEnergy, newHunger);
    }

    public void horseBanner(Horses horse, int energy, int hunger) {
        int[] stats = {0, 0};

        hunger = Checker.checkCap(hunger);
        energy = Checker.checkCap(energy);

        for (int i = 0; i < Activities.selectActivity(selected).length; i++) {
            stats[i] = Activities.selectActivity(selected)[i];
        }

        int newEnergy = energy - stats[0];
        int newHunger = hunger - stats[1];

        if (counter == 0) {
            newEnergy = 100;
            newHunger = 100;
        } else {
            newEnergy -= stats[0];
            newHunger -= stats[1];
        }
        this.counter++;

        newHunger = Checker.checkCap(newHunger);
        newEnergy = Checker.checkCap(newEnergy);

        System.out.print(Colors.colorList.get(6)+"+===============================================================================");
        System.out.print(Colors.colorList.get(6)+"\n  \uD83D\uDD38 : " + horse.getSpeciesRarity() + "                         \uD83D\uDC51" + horse.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
        System.out.print(Colors.colorList.get(6)+"\n  \u26A5  : " + horse.getSpeciesBreed() + "                   (◕(‘人‘) ◕)                         \u2764: " + newHunger);
        System.out.print(Colors.colorList.get(6)+"\n+                                                                              +\n");
        System.out.print(Colors.colorList.get(6)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
        System.out.print(Colors.colorList.get(6)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
        System.out.print(Colors.colorList.get(6)+"\n+                              Press '5' to exit!                              +\n");
        System.out.print(Colors.colorList.get(6)+"+===============================================================================\n"+Colors.colorList.get(0));

        if(selected == 4) {
            System.out.print(Colors.colorList.get(6)+"+===============================================================================+");
            System.out.print(Colors.colorList.get(6)+"\n+ \uD83D\uDD38 : " + horse.getSpeciesRarity() + "                         \uD83D\uDC51" + horse.petName.toUpperCase() + "\uD83D\uDC51                      \u26A1: " + newEnergy);
            System.out.print(Colors.colorList.get(6)+"\n+ \u26A5  : " + horse.getSpeciesBreed() + "                   (◕(‘人‘) ◕)                         \u2764: " + newHunger);
            System.out.print(Colors.colorList.get(6)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(6)+"\n+                           SHOWING STATS:                                +\n");
            System.out.print(Colors.colorList.get(6)+"\nSpecies: " + horse.getSpeciesName() + "       |          Trait: " + horse.getTrait() + "      |      Food Group:  " + horse.getFoodGroup() + "   +\n");
            System.out.print(Colors.colorList.get(6)+"\nSound: " + horse.getSpeciesSound() + "      |          Jump Height: " + horse.getJumpHeight() + "         | Speed: " + horse.getSpeed() + "       +\n");
            System.out.print(Colors.colorList.get(6)+"\nAge: " + horse.getAge() + "        |         Type: " + horse.getHorseType() + "         |        Rarity: " + horse.getSpeciesRarity() + " +\n");
            System.out.print(Colors.colorList.get(6)+"\n+                                                                              +\n");
            System.out.print(Colors.colorList.get(6)+"\n+                           CHOOSE AN ACTIVITY:                                +\n");
            System.out.print(Colors.colorList.get(6)+"\n+         1. EXERCISE     2. FEED         3.SLEEP         4.SHOW STATS         +\n");
            System.out.print(Colors.colorList.get(6)+"+===============================================================================\n"+Colors.colorList.get(0));
            while (true) {
                try {
                    selected = scanner.nextInt();
                    break; // break the loop if the input is valid
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter a valid number: ");
                    scanner.nextLine(); // consume the invalid input
                }
            }
        } else{
            while (!scanner.hasNextInt() || (selected = scanner.nextInt()) < 1 || selected > 5) {
                System.out.print("Invalid input. \n");
                scanner.nextLine(); // consume the invalid input
            }
        }
        String output = ("Name: "+Main.finalUsername+"\nPet Name: "+horse.getPetName()+"\nSpecies: "+horse.getSpeciesName());
        saveGame(output);
        horseBanner(horse, newEnergy, newHunger);
    }

    //function to save the game
    public static void saveGame(String output){
        //error handlnig with message
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(output);
            writer.close();
            System.out.println("Output saved to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the output to file: " + e.getMessage());
        }
    }
}


