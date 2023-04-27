package ClassPractice;

public class Human {//main class, class contructor and main class should have the same name

  //Variable/Attribute Declaration. Assign values in the class constructor during class Declaration
    String name;
    int age;
    double height;
    String haircolor;
    int weight;

  public static void main(String[] args){//main method

    //in order to create an object of the human class you have to create and instance of it in the main method
    Human Drew = new Human("Drew", "Brown", 5.11, 27, 170);
    Human vari = new Human("Vari", "black", 5.6, 19, 150);

      System.out.println(Drew);
      System.out.println(vari);




    }

    //Class declaration using a primary constructor
  public Human(String name, String haircolor, double height, int age, int weight){//Class Constructor

    // "this.(variable)" states that the value of the variable are connected to that specific class
     this.name = name;
     this.haircolor = haircolor;
     this.height = height;
     this.age = age;
     this.weight = weight;


  }

  @Override
    public String toString(){//use toString mathod to override the Human method so I can pull the actual variable values
      //instead of the memory ID

      return "name: " + name + "\n" +
              " HairColor: " + haircolor + "\n" +
              " Height: " + height + "\n" +
              " age: " + age + "\n" +
              " Weight: " + weight;
  }
}
