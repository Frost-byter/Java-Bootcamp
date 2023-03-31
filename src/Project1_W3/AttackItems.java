package Project1_W3;

import static Project1_W3.Adventurers.Att;

public class AttackItems extends Items {



    public AttackItems(int bronzeSword, int steelSword, int silverSword) {
        super();

       this.setbronzeSword(bronzeSword);
       this.setsteelSword(steelSword);
       this.setsilverSword(silverSword);



    }


    public String toString(int Items, int Att) {
         Att += Items;
        return  "Your Attack is now " + Att;
    }










}
