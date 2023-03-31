package Project1_W3;

public class Monsters {

        protected String[] name;

        protected int maxHealth; // instantiate and initialize here but don't assign values to variables

        protected int maxAtt;

        protected int maxDef;


    // Monster variables will be "Goblin", "Jabawakie", "Gladiator"
    // Math.floor(Math.random() * (max - min + 1) + min)
    // math.floor - rounds the sum of the above method to the nearest double
    // math.random() gives a random value between 0-1 including decimals like 0.5
    // * (max - min + 1) + min) - multiplies the random value previously provided by the sum in the ()
    // and re-add the min to stay in range

    public Monsters(){
        String[] MonName = {"Goblin", "Jabawakie", "Gladiator"};
        this.name = MonName;
        this.maxHealth = (int)Math.floor(Math.random() *  (120 - 30 + 1) + 30);
        //take the math.random method and assign to the variable here so that each
        //respective variable has a unique value for each child class assigned to the parent class

        this.maxAtt = (int)Math.floor(Math.random() * (45 - 25 + 1) + 25);

        this.maxDef = (int)Math.floor(Math.random() * (30 - 10 + 1) + 10);


    }


    public int getmaxHealth(){return this.maxHealth;}

    public void setmaxHealth(int maxHealth) {this.maxHealth = maxHealth;}

    public int getmaxAtt(){return this.maxAtt;}

    public void setmaxAtt(int maxAtt) {this.maxAtt = maxAtt;}

    public int getmaxDef(){return this.maxDef;}

    public void setmaxDef(int maxDef){this.maxDef = maxDef;}



}
