package project.pkg1;
public class Fish extends Species{

private String waterLevel; //The water level the fish can live in
private String scaleType; //The type of scales the fish has
private String Location; //The location where the fish is found

//Fish constructor that initializes the Fish properties as well as Species properties
public Fish(String waterLevel, String scaleType, String Location, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
    super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
    this.waterLevel = waterLevel;
    this.scaleType = scaleType;
    this.Location = Location;
}

/**
 * @return the waterLevel
 */
public String getWaterLevel() {
    return waterLevel;
}

/**
 * @param waterLevel the waterLevel to set
 */
public void setWaterLevel(String waterLevel) {
    this.waterLevel = waterLevel;
}

/**
 * @return the scaleType
 */
public String getScaleType() {
    return scaleType;
}

/**
 * @param scaleType the scaleType to set
 */
public void setScaleType(String scaleType) {
    this.scaleType = scaleType;
}

/**
 * @return the Location
 */
public String getLocation() {
    return Location;
}

/**
 * @param Location the Location to set
 */
public void setLocation(String Location) {
    this.Location = Location;
}

//Override the getSpeciesSound method to add custom sound behavior for Fish with Ctenoid scales
@Override
public String getSpeciesSound() {
    if (scaleType.equals("Ctenoid")) {
        return "Fshhhhhh";
    } else {
        return super.getSpeciesSound(); //Return the default species sound from the parent class
    }
}

}
