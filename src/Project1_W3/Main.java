package Project1_W3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

import static Project1_W3.Adventurers.HP;

public class Main {




    public static void main(String[] args){

        //need to clean this up a bit

        Scanner in = new Scanner(System.in);
        System.out.println("The goddess smiles on thee. Pray tell, what if your name dear adventurer!: ");
//
        Adventurers advent = new Adventurers();

        Scenarios Scene = new Scenarios();
        advent.setAtt(Scene.Scene1(advent.getAtt(), advent.getName()));


        System.out.println(advent.getName());
        System.out.println("Weary " + advent.getName() + " Rest thy soul");






        System.out.println(advent.HP);



        //Combat stats for monsters
        Monsters Combat = new Monsters();
        System.out.println(Combat.getmaxHealth());
        System.out.println(Combat.getmaxAtt());
        System.out.println(Combat.getmaxDef());


        boolean running = true;
        //Need intro around here



            Object Game;
            while(running) {//combat mechanics between user and monsters
             System.out.println("--------------------------------------------");




               //Resetting Player Stats
                advent.setHP(100);
                advent.setDef(15);
                advent.setAtt(10);

                //Resetting Monster Stats
                Combat.setmaxHealth((int)Math.floor(Math.random() *  (120 - 30 + 1) + 30));
                Combat.setmaxDef((int)Math.floor(Math.random() * (30 - 10 + 1) + 10));
                Combat.setmaxAtt((int)Math.floor(Math.random() * (45 - 25 + 1) + 25));

                //creating a random constructor to call a random monster
                int randM = (int)Math.floor(Math.random() * 3 );
                Monsters MonName = new Monsters();

                //creating variable to hold random monster name through combat phase
                String MonName1 = MonName.name[randM];
                Scene.Scene2();
                System.out.println("\t As you walk through the forest, aptly named Shaded Woods, you see tracks in the ground. \n " +
                " You try to make them out, they seem somewhat humanoid. As you examine them you hear a noise and suddenly a \n" + MonName.name[randM] + " appeared as you make your way through the forest \n");
                Scene.Scene3(true);

                System.out.println("\tAdventurer HP: " + advent.HP);
                System.out.println("\tEnemy HP: " + Combat.getmaxHealth());
                System.out.println("\tChoose your Action: ");
                System.out.println("\t1. Attack ");
                System.out.println("\t2. Defend ");
                System.out.println("\t3. Run ");

                String input = in.nextLine();


                loop:
                do {











                    if(input.equals("1")){

                        int damageDealt = advent.getAtt() - Combat.getmaxDef();

                            if(damageDealt < 0){
                                damageDealt = 0;
                            } //might have to do similar for other combat actions

                        System.out.println("You attacked the " + MonName1 + " for: " + damageDealt + " damage");
                        //trying to set the amount of damage dealt to monster during combat + items and gear


                        int damageTaken = (Combat.getmaxAtt() - advent.getDef()) ;//+ DefItems()); //figure this out, don't forget parenthesis


                        System.out.println("The " + MonName1 + " attacked you for: " + damageTaken + " damage");

                        advent.setHP(advent.getHP() - damageTaken);
                        System.out.println("Your HP is now: " + advent.getHP());

                         int enemyHealth = Combat.getmaxHealth() - damageDealt;
                         Combat.setmaxHealth(enemyHealth);
                        System.out.println("The " + MonName1 + " has: " + enemyHealth + " HP");


                            if(advent.checkHP()){
                                System.out.println("You have died dear adventurer, the goddess embraces thee ");
                                break;
                            }

                            Scene.Scene3(false);
                            break loop;
                    } else if(input.equals("2")){
                        advent.setDef(advent.getDef() * 2);

                        System.out.println("You defended against " + MonName1 + "'s attack");

                        int damageTaken = Combat.getmaxAtt() - advent.getDef() ;//+ DefItems()); //figure this out, don't forget parenthesis

                        if(damageTaken < 0){
                            damageTaken = 0;
                        } //might have to do similar for other combat actions

                        System.out.println("The " + MonName1 + " attacked you for: " + damageTaken + " damage");

                        advent.setHP(advent.getHP() - damageTaken);
                        System.out.println("Your HP is now: " + advent.getHP() + "\n");

                        if(advent.checkHP()){
                            System.out.println("You have died dear adventurer, the goddess embraces thee ");
                            break;

                        }

                    }else if(input.equals("3")){


                        System.out.println(MonName1 + "'s ferocious visage has rendered you deathly afraid. With a sour smell running down your legs you turn tail and run \n ");
                        Scene.Scene3(true);
                        break loop;
                        // supposed to skip to the next scene
                    }
                if (Combat.maxHealth <= 0){
                    System.out.println("\tYou have been victorious and proceed to venture further into the forest, in search of loot and glory! You come across the monsters lair " +
                            " and proceed to dig through it. Inside you discover various pieces of armor, choose one adventurer \n ");

                }
                } while (Combat.maxHealth > 0);
        }



    }

}
