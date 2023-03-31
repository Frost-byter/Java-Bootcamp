package Week3.zoo.Mammals;

public class Cow extends Mammals {

    public  Cow(String name, String color, double size, boolean milk) {
        super(name,color,size,milk);


    }

    @Override
    public void Moo(){System.out.println("Mooooo, Get out the way, get out the way!!");}
}
