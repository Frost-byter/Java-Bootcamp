package Week3.zoo.Mammals;

public class Main {

    public static void main(String[] args) {
        // create matching parameters with correct data types for the main method and the parent/child class
        Cheetah Chester = new Cheetah("Chester", "Yellow and black", 22.7, true);
        Bear Smokey = new Bear("Smokey", "Dark Brown", 44.5, true);
        Cow Otus = new Cow("Otus", "Black and White", 50.3, true);

        Cow.Mammals();
        Cheetah.Mammals();
        Bear.Mammals();

        Otus.Moo();

        Chester.growl();

        Smokey.roar();

    }
}
