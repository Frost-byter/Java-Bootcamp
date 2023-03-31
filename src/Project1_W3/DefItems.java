package Project1_W3;


import static Project1_W3.Adventurers.Def;

public class DefItems extends Items{



    public DefItems(int bronzeArmor, int steelArmor, int blackArmor) {
        super();

        this.setbronzeArmor(bronzeArmor);
        this.setsteelArmor(steelArmor);
        this.setblackArmor(blackArmor);



    }

    public String toString(int Items, int Def) {
        Def += Items;
        return  "Your Defense is now " + Def;
    }

}
