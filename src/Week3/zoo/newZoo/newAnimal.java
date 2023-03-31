package Week3.zoo.newZoo;
//this is a class, everything in java lives in a class.
//only need one main method is one file
//separate out your concerns of what defines the class i.e. in this case an animal
// classes only worry about their functionality
//only knows about itself and any parent classes it might have but not child classes

//******Step 1*********** defining class properties
//public class newAnimal {
//
//    //encapsulate your values or classes
//    //encapsulation has two parts
//    //1. private/ protected properties
//    //2. public getters and setters
//
//    private String name;
//    private boolean fur;
//    private double weight;
//    public final String PLANET = "Earth";
//    //******Step 2****** encapsulation using getters and setters
//
//    //everything has an access modifier
//    //public - everything, everywhere can access this value
//    //protected - you can access a value as long as it's within the same class, package, and subclass
//    //default - you can access a value if it's within the same class or package. Does not have to be stated
//    //private - the value can only be accessed within that specific class
//
//    //"this" refers to the current instance of a class
//    //it's the same as the class saying "MY name" or "MY weight" it shows that specific property belonging to said class
//    // "return" is like a transaction, each method is a transaction between different data types. Until the program being
//    //gets back the correct change(data type) the transaction isn't over
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getWeight(double weight) {
//        return this.weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public boolean isFur() {
//        return this.fur;
//    }
//
//    public void setFur(boolean fur) {
//        this.fur = fur;
//    }
//
//}
// everything in Java lives inside a class
// separate out your concerns: your classes only worry about their own functionality

//******Step 1*********** defining class properties
public class newAnimal {

    // encapsulate your classes
    // encapsulation has two parts
    // 1. private/ protected properties
    // 2. public getters and setters
    private String name;
    private boolean fur;
    private double weight;
    // final means that the variable can never change
    // best practice is to capitalize final values
    public final String PLANET = "Earth";

    //******Step 2****** encapsulation using getters and setters

    // everything has an access modifier
    // public - everything, everywhere can access this
    // protected - the class, the same package, and within a subclass
    // default - the class or the same package
    // private - the class

    // I have not defined a constructor here, so I have the default constructor
    // the default constructor calls object's constructor

    // "this" refers to the current instance of a class
    // it's the same as the class saying "MY name, or MY weight, etc"
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFur() {
        return this.fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }
}