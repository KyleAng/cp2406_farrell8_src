public class PetSold extends ItemSold{
    boolean pet_vaccinated;
    boolean pet_neutered;
    boolean pet_housebroken;

    public PetSold(){}

    public boolean isPet_vaccinated() {
        return pet_vaccinated;
    }

    public boolean isPet_neutered() {
        return pet_neutered;
    }

    public boolean isPet_housebroken() {
        return pet_housebroken;
    }

    public void setPet_vaccinated(boolean vaccinated) {
        this.pet_vaccinated = vaccinated;
    }

    public void setPet_neutered(boolean neutered) {
        this.pet_neutered = neutered;
    }

    public void setPet_housebroken(boolean housebroken) {
        this.pet_housebroken = housebroken;
    }
}
