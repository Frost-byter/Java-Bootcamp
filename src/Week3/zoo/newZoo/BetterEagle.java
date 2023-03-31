package Week3.zoo.newZoo;


//******Step4****** Define grandchild classes
// As many classes as I want can extend BetterBird
public class BetterEagle extends BetterBird {

    public BetterEagle(String name, boolean fur, double weight, double speed, double wingspan) {
        super(name, fur, weight, speed, wingspan);
    }

    @Override
    public void speak() {
        System.out.println("KAWWW!");
    }

    //you cannot override final methods
    //final classes cannot be extended, you cannot inherit from a final class
}