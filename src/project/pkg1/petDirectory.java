package project.pkg1;
public class petDirectory {
    //storage of all pet information
    
    //DOGS
    Pets Max = new Dogs(true, 5, 4, "Husky", "Dog", "Rare", "Woof", "Carnivore", "Max", 6, 100, 100, "Energetic");
    Pets Kevin = new Dogs(true, 4, 3, "Golden Retriever", "Dog", "Common", "Ruff", "Omnivore", "Kevin", 9, 100, 100, "Cheerful");
    Pets Ray = new Dogs(false, 2, 1, "Chihuahua", "Dog", "Uncommon", "Grrrr", "Omnivore", "Ray", 1, 100, 100, "Annoying");
    Pets Bean = new Dogs(true, 5, 2, "French Bulldog", "Dog", "Rare", "Vuff", "Carnivore", "Bean", 3, 100, 100, "Powerful");
    Pets Sky = new Dogs(false, 4, 4, "German Shepherd", "Dog", "Epic", "Woof", "Carnivore", "Sky", 8, 100, 100, "Protective");

    //CATS
    Pets Maxine = new Cats(3, "Orange", true, "Bangal", "Cat", "Uncommon", "Meow", "Carnivore", "Maxine", 1, 100, 100, "Lazy");
    Pets Moth = new Cats(4, "Brown", false, "Abyssinian", "Cat", "Rare", "", "Omnivore", "Moth", 12, 100, 100, "Stubborn");
    Pets White = new Cats(5, "Black", true, "Ragdoll", "Cat", "Common", "Purrrr", "Carnivore", "White", 9, 100, 100, "Unlucky");
    Pets Nugget = new Cats(2, "Grey", true, "Nugget", "Cat", "Birman", "Hurrrr", "Omnivore", "Nugget", 5, 100, 100, "Aggressive");
    Pets Dory = new Cats(1, "Cream", false, "Scottish Fold", "Cat", "Epic", "", "Carnivore", "Dory", 14, 100, 100, "Playful");

    //HORSES
    Pets Mustang = new Horses(78, "Racing", 3.17, "Arabian", "Horse", "Epic", "", "Herbivore", "Mustang", 7, 100, 100, "Competitive");
    Pets Brad = new Horses(43, "Farming", 1.89, "ThoroughBred", "Horse", "Common", "Nieggggh", "Herbivore", "Brad", 9, 100, 100, "Hardworking");

    Pets Clyde = new Horses(45, "Draft", 2.92, "Clydesdale", "Horse", "Common", "Neigh", "Herbivore", "Clyde", 10, 100, 100, "Strong");
    Pets Goldie = new Horses(60, "Pleasure", 3.85, "Palomino", "Horse", "Rare", "", "Herbivore", "Goldie", 5, 100, 100, "Friendly");
    Pets Spot = new Horses(72, "Performance", 1.75, "Appaloosa ", "Horse", "Uncommon", "", "Herbivore", "Spot", 9, 100, 100, "Agile");

    //BIRDS
    Pets Harry = new Birds("Long", true, 7, "Canary", "Bird", "Common", "ChirpChrip", "Omnivore", "Harry", 2, 100, 100, "Cheerful");
    Pets Molly = new Birds("Short", false, 0, "Kiwi", "Bird", "Epic", "", "Omnivore", "Molly", 5, 100, 100, "Nocturnal");
    Pets Betty = new Birds("Medium", true, 3, "Cockatoo", "Bird", "Rare", "CawCaw", "Omnivore", "Betty", 7, 100, 100, "Intelligent");
    Pets Hawk = new Birds("Long", true, 9, "Falcon", "Bird", "Uncommon", "Squawk", "Carnivore", "Hawk", 4, 100, 100, "Aggressive");
    Pets Moon = new Birds("Short", false, 6, "Owl", "Bird", "Common", "", "Carnivore", "Moon", 1, 100, 100, "Wise");

    //INSECTS
    Pets Aragogg = new Insects(8, true, 8, "Spider", "Insects", "Epic", "", "Omnivore", "Aragogg", 12, 100, 100, "Killer");
    Pets Hamada = new Insects(6, false, 2, "Butterfly", "Insects", "Common", "Flutter", "Herbivore", "Hamada", 3, 100, 100, "Graceful");
    Pets Scarlet = new Insects(6, false, 2, "Ladybug", "Insects", "Uncommon", "Bzz", "Herbivore", "Scarlet", 6, 100, 100, "Lucky");
    Pets Sandy = new Insects(0, false, 0, "Worm", "Insects", "Rare", "Squirm", "Detritivore", "Sandy", 1, 100, 100, "Slimy");
    Pets Destin = new Insects(8, true, 4, "Scorpion", "Insects", "Common", "", "Carnivore", "Destin", 8, 100, 100, "Venomous");

    //FISH
    Pets Bruce = new Fish("10000ft", "Placoid", "Pacific Ocean", "Megalodon", "Fishes", "Epic", "Grrrr", "Carnivore", "Bruce", 78, 100, 100, "Hunter");
    Fish Nemo = new Fish("40ft", "Ctenoid", "Great Barrier Reef", "Clownfish", "Fishes", "Common", "", "Omnivore", "Nemo", 4, 100, 100, "Adventurous");
    Fish Bubbles = new Fish("200ft", "Ctenoid", "Amazon River", "Angelfish", "Fishes", "Uncommon", "", "Omnivore", "Bubbles", 8, 100, 100, "Peaceful");
    Fish Gary = new Fish("5ft", "Cyprinid", "Asia", "Goldfish", "Fishes", "Common", "Bubble", "Omnivore", "Gary", 2, 100, 100, "Playful");
    Fish Finley = new Fish("4000ft", "Placoid", "Atlantic Ocean", "Mackerel", "Fishes", "Rare", "Chomp chomp", "Carnivore", "Finley", 32, 100, 100, "Aggressive");

    //returning pets
    public Pets getMax() {
        return Max;
    }
    public Pets getKevin() {
        return Kevin;
    }
    public Pets getRay() {
        return Ray;
    }
    public Pets getBean() {
        return Bean;
    }
    public Pets getSky() {
        return Sky;
    }
    public Pets getMaxine(){
        return Maxine;
    }

    public Pets getMoth(){
        return Moth;
    }

    public Pets getWhite(){
        return White;
    }

    public Pets getNugget(){
        return Nugget;
    }

    public Pets getDory(){
        return Dory;
    }

    public Pets getMustang() {
        return Mustang;
    }

    public Pets getBrad() {
        return Brad;
    }

    public Pets getClyde() {
        return Clyde;
    }

    public Pets getGoldie() {
        return Goldie;
    }

    public Pets getSpot() {
        return Spot;
    }

    public Pets getHarry() {
        return Harry;
    }

    public Pets getMolly() {
        return Molly;
    }

    public Pets getBetty() {
        return Betty;
    }

    public Pets getHawk() {
        return Hawk;
    }

    public Pets getMoon() {
        return Moon;
    }

    public Pets getAragogg() {
        return Aragogg;
    }

    public Pets getHamada() {
        return Hamada;
    }

    public Pets getScarlet() {
        return Scarlet;
    }

    public Pets getSandy() {
        return Sandy;
    }

    public Pets getDestin() {
        return Destin;
    }

    public Pets getBruce() {
        return Bruce;
    }


    public Pets getNemo() {
        return Nemo;
    }

    public Pets getBubbles() {
        return Bubbles;
    }

    public Pets getGary() {
        return Gary;
    }

    public Pets getFinley() {
        return Finley;
    }



}
