package Project1_W3;

import java.util.Scanner;

public class Scenarios extends Adventurers {
    Scanner in = new Scanner(System.in);

    public Scenarios() {
        super();


        System.out.println("You find yourself waking up in a strange forest, the flora and fauna around" +
                " you is unrecognizable. You look around and notice that the trees are varying shades of green and brown" +
                " with many vines wrapping around them, and hanging down from the branches. You hear the cries of different animals" +
                " in the distance, each one sounds alien to you and unfamiliar. The only familiar thing the situation in which you find yourself is" +
                " is the slightly warm breeze blowing past you and ruffling your hair.");

        //insert line break here*


    }

    public int Scene1(int Att, String name) {

        System.out.println("As you acclimate to your new surroundings you meet some villagers while walking, they think you strange but offer to bring you back with them and offer food and water.");

        //either insert line break here or combine these two*
        //somewhere in here I need to give the option to choose a class
        System.out.println("One of the villagers offers you a room at his home, a burly gentleman with gnarled, rough hands. He stood a foot over you easily but he had a gentle smile with bronze skin and curly, lightly tousled hair." +
                "You graciously follow him to his abode. Once inside you come across a chest and your host Jako, explains that he used to be an adventurer." +
                " He says you're welcome to pick one sword out of his collection. You open it and inside sits three weapons, a bronze sword, a steel sword, and a black sword. Choose wisely, you may only take one young" +
                "adventurer: ");


        System.out.println("\tChoose your Action: ");
        System.out.println("\t1. BronzeSword ");
        System.out.println("\t2. Steel Sword ");
        System.out.println("\t3. Silver Sword ");

        String input = in.nextLine();
        int damageValue = 0;
        if (input.equalsIgnoreCase("1")) {

            damageValue = Att + AttackItems.bronzeSword;
            System.out.println(name + " has picked the BronzeSword, your attack is now: " + damageValue + " damage.");


        } else if (input.equalsIgnoreCase("2")) {
            damageValue = Att + AttackItems.steelSword;
            System.out.println(name + " has picked the SteelSword, your attack is now: " + damageValue + " damage.");


        } else {
            damageValue = Att + AttackItems.silverSword;
            System.out.println(name + " has picked the SilverSword, your attack is now: " + damageValue + " damage.");
        }
        return damageValue;


    }

    // insert a line break here*
    public int Scene2() {//armor is rewarded here, story progresses from the forest adventure to further exploring forest and maybe coming across a dungeon
        System.out.println("\t You spend the next month slowly getting used to your new life and learning about your environment. Jako said that you are well suited to becoming an adventurer \n" +
                " \t but he warns that this occupation is exceptionally dangerous at times and so has been tutoring you in the way of the sword. You find that you surprisingly enjoy this. \n" +
                "\t As you complete your training Jako tells you to decide on what profession of adventurer you want to purse");

        String input = in.nextLine();

        System.out.println("\t1. Paladin ");
        System.out.println("\t2. Warrior ");
        System.out.println("\t3. Duelist \n");

        System.out.println("\n After picking your profession you tell Jako you will go outside the village for the first time since arriving here. It's relatively safe in this area \n" +
                "\t so Jako, gives you his blessings. He wishes you luck as you take the first steps towards building your new life in a new world. \n");


        System.out.println("\tChoose your Action: ");
        System.out.println("\t1. BronzeArmor ");
        System.out.println("\t2. SteelArmor ");
        System.out.println("\t3. BlackArmor ");

        int armorValue = 0;
        if (input.equalsIgnoreCase("1")) {

            armorValue = Def + DefItems.bronzeArmor;
            System.out.println(name + " has picked the BronzeArmor, your attack is now: " + armorValue + " damage.");


        } else if (input.equalsIgnoreCase("2")) {
            armorValue = Def + DefItems.steelArmor;
            System.out.println(name + " has picked the SteelArmor, your attack is now: " + armorValue + " damage.");


        } else {
            armorValue = Def + DefItems.blackArmor;
            System.out.println(name + " has picked the BlackArmor, your attack is now: " + armorValue + " damage.");
        }
        return armorValue;


    }

    public void Scene3(boolean flag) {// either you explore a dungeon or you find some other extraordinary site
        System.out.println("\t As you Continue forward after that harrowing experience, your first combat experience, you continue on your path. Some hours later as the sun starts to fall you can smell moisture in the air \n" +
                "\t You find a cave entrance and decide to camp inside to rest until the weather clears.  You find yourself missing the friendly faces and comradery with Jako as you fall asleep. \n");
        System.out.println("=======================================================================================");

        System.out.println("\t Four days have now passed since you last visited the village and came to this cursed cave, you planned to wait out the bad weather and leave. \n" +
                "\t But it's been nothing but nonstop raining, in that time you discovered that the cave goes deeper in than you originally thought \n"
                + "\t you decide to spend the leisure time you find yourself in abundance of with exploring further inside the cave, after all, where there is no risk there is no gain.");


        if (flag) {
            System.out.println("As you run away you shame eats at you");
        } else System.out.println("You stand your ground");


    }

}

