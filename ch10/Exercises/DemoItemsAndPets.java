public class DemoItemsAndPets {
    public static void main(String[] args){
        ItemSold my_item = new ItemSold();
        my_item.setItem_description("Sheba melty tuna cat stick 4 pax");
        my_item.setItem_invoice_num(1);
        my_item.setPrice(2.0);
        System.out.println("My item is " + my_item.getClass());
        System.out.println("My item is a " + my_item.getItem_description() + " Of invoice number " + my_item.getItem_invoice_num());
        System.out.println("My item costs $" + my_item.getPrice());

        PetSold your_pet = new PetSold();
        your_pet.setItem_description("Tabby Cat");
        your_pet.setItem_invoice_num(2);
        your_pet.setPrice(1550.50);
        your_pet.setPet_housebroken(false);
        your_pet.setPet_neutered(false);
        your_pet.setPet_vaccinated(true);
        String house;
        String neutered;
        String vaccinated;
        if(your_pet.isPet_housebroken())
            house = "is housebroken";
        else
            house = "not housebroken";
        if(your_pet.isPet_neutered())
            neutered = "is neutered";
        else
            neutered = "not neutered";
        if(your_pet.isPet_vaccinated())
            vaccinated = "is vaccinated";
        else
            vaccinated = "not vaccinated";
        System.out.println("Your pet is " + your_pet.getClass());
        System.out.println("Your pet is a " + your_pet.getItem_description() + " Of invoice number " + your_pet.getItem_invoice_num());
        System.out.println("Your pet costs $" + your_pet.getPrice());
        System.out.println("Your pet is " + house + ", " + neutered + " and " + vaccinated);


    }
}
