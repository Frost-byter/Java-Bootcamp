package Project1_W3;



public class UtilItems extends Items{


    public UtilItems(int necklaceofGrowth, int necklaceofTheSteadfast, int necklaceofAgaroth) {
        super();

        this.setnecklaceofGrowth(necklaceofGrowth);
        this.setnecklaceofTheSteadfast(necklaceofTheSteadfast);
        this.setnecklaceofAgaroth(necklaceofAgaroth);



    }

    public String toString(int Items, int HP,int Def, int Att) {

        if (necklaceofGrowth == Items) {
            HP += Items;
            return "Your Health is now " + HP;
        } else if (necklaceofTheSteadfast == Items){
            Def += Items;
            return "Your Defense is now " + Def;
        } else{
            Att += Items;
            return "Your Attack is now " + Att;
        }

    }
}
