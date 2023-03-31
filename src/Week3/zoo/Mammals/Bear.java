package Week3.zoo.Mammals;

public class Bear extends Mammals{

    public Bear(String name, String color, double size, boolean milk) {
        super(name, color, size, milk);



    }

    @Override
    public void roar(){System.out.println("Only you can stop forest fires!");}
}
