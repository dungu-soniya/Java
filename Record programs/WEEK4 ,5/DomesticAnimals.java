
package animalprog;

class DomesticAnimal {

    String animalName;
    String shelter;
    String diet;

    // Default constructor
    DomesticAnimal() {
        animalName = "Unknown";
        shelter = "Farm";
        diet = "Food";
    }

    // Parameterized constructor
    DomesticAnimal(String animalName, String shelter, String diet) {
        this.animalName = animalName;
        this.shelter = shelter;
        this.diet = diet;
    }

    void showDetails() {
        System.out.println("Animal: " + animalName);
        System.out.println("Shelter: " + shelter);
        System.out.println("Food: " + diet);
    }

    void makeSound(String voice) {
        System.out.println("Sound: " + voice);
    }

    // Method overloading
    void makeSound(String voice, int count) {
        System.out.println("Sound: " + voice);
        System.out.println("Repeated: " + count + " times");
    }
}

public class DomesticAnimals {

    public static void main(String[] args) {

        DomesticAnimal goat = new DomesticAnimal(
                "Goat", "Goat Shed", "Leaves");

        DomesticAnimal sheep = new DomesticAnimal(
                "Sheep", "Sheep Pen", "Grass");

        DomesticAnimal dog = new DomesticAnimal(
                "Dog", "Kennel", "Dog Food");

        goat.showDetails();
        goat.makeSound("Bleat");
        System.out.println();

        sheep.showDetails();
        sheep.makeSound("Baa");
        System.out.println();

        dog.showDetails();
        dog.makeSound("Bark", 3);
    }
}
Animal: Goat
Shelter: Goat Shed
Food: Leaves
Sound: Bleat

Animal: Sheep
Shelter: Sheep Pen
Food: Grass
Sound: Baa

Animal: Dog
Shelter: Kennel
Food: Dog Food
Sound: Bark
Repeated: 3 times
