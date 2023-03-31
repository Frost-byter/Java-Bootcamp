package Project1_W3;

import static Project1_W3.Adventurers.Att; //might have to change access modifier from static
import static Project1_W3.Adventurers.Def;
import static Project1_W3.Adventurers.HP;
public class Items {


    protected static int bronzeSword;
    protected static int steelSword;
    protected static int silverSword;

    protected static int bronzeArmor;
    protected static int steelArmor;
    protected static int blackArmor;

    protected static int necklaceofGrowth;
    protected static int necklaceofTheSteadfast;
    protected static int necklaceofAgaroth;

//might actually write out new items for each class like swords for warriors, daggers and knives for rogues, and bows and leather armor for archers. We'll see.

    public Items() { //Attack

        this.bronzeSword = 25;
        this.steelSword = 35;
        this.silverSword = 60;

        this.bronzeArmor = 30;
        this.steelArmor = 40;
        this.blackArmor = 50;

        this.necklaceofGrowth = 20; //HP
        this.necklaceofTheSteadfast = 10; //Def
        this.necklaceofAgaroth = 12; //Att
    }

    public int getbronzeSword(){
        return bronzeSword;
    }

    public void setbronzeSword(int bronzeSword){
        this.bronzeSword = bronzeSword;
    }

    public int getsteelSword(){
        return steelSword;
    }

    public void setsteelSword(int steelSword){
        this.steelSword = steelSword;
    }

    public int getsilverSword(){
        return silverSword;
    }

    public void setsilverSword(int silverSword){
        this.silverSword = silverSword;
    }

    public int getbronzeArmor(){
        return bronzeArmor;
    }

    public void setbronzeArmor(int bronzeArmor){
        this.bronzeArmor = bronzeArmor;
    }

    public int getsteelArmor(){
        return steelArmor;
    }

    public void setsteelArmor(int steelArmor){
        this.steelArmor = steelArmor;
    }

    public int getblackArmor(){
        return blackArmor;
    }

    public void setblackArmor(int blackArmor){
        this.blackArmor = blackArmor;
    }

    public int getnecklaceofGrowth(){
        return necklaceofGrowth;
    }

    public void setnecklaceofGrowth(int necklaceofGrowth){
        this.necklaceofGrowth = necklaceofGrowth;
    }

    public int getnecklaceofTheSteadfast(){
        return necklaceofTheSteadfast;
    }

    public void setnecklaceofTheSteadfast(int necklaceofTheSteadfast){
        this.necklaceofTheSteadfast = necklaceofTheSteadfast;
    }

    public int getnecklaceofAgaroth(){
        return necklaceofAgaroth;
    }

    public void setnecklaceofAgaroth(int necklaceofAgaroth){
        this.necklaceofAgaroth = necklaceofAgaroth;
    }


}
