package project.pkg1;
public class Pets {
    public String petName = null;
    private int age;
    private int energy;
    private int food;
    private String trait;

    //pet constructor
    public Pets(String petName, int age, int energy, int food, String trait) {
        this.petName = petName;
        this.age = age;
        this.energy = energy;
        this.food = food;
        this.trait = trait;
    }

    /**
     * @return the petName
     */
    public String getPetName() {
        return petName;
    }

    /**
     * @param petName the petName to set
     */
    public void setPetName(String petName) {
        this.petName = petName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the energy
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * @param energy the energy to set
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * @return the food
     */
    public int getFood() {
        return food;
    }

    /**
     * @param food the food to set
     */
    public void setFood(int food) {
        this.food = food;
    }

    /**
     * @return the trait
     */
    public String getTrait() {
        return trait;
    }

    /**
     * @param trait the trait to set
     */
    public void setTrait(String trait) {
        this.trait = trait;
    }

}
