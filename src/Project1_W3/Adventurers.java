package Project1_W3;


import java.util.Scanner;

public class Adventurers {

    protected String name;
    protected static int HP ;
    protected static int Att;
    protected static int Def;
    protected static int Xp;
    protected static int lvl;

    protected int weaponValue;
    protected int armorValue;
    protected int utilValue;


     Scanner in = new Scanner(System.in);


    public Adventurers(){

        this.name = in.nextLine() ;
        this.HP = 100;
        this.Att = 35;
        this.Def = 45;
        this.Xp = 0;
        this.lvl = 1;
        this.weaponValue = 0;
        this.armorValue = 0;
        this.utilValue = 0;
    }


    public String getAdventurers(){return this.name;}

    public String setAdventurers(String name){
        this.name = name;
        return name;
    }

    public int getHP(){
        return this.HP + utilValue;
    }

    public void setHP(int Hp){
        this.HP = Hp;
    }

    public int getAtt(){
        return this.Att + this.weaponValue + utilValue;
    }

    public void setAtt(int Attack){
        this.Att = Attack;
    }

    public int getDef(){
        return this.Def + this.armorValue + utilValue;
    }

    public void setDef(int Defense){
        this.Def = Defense;
    }

    public String getName(){
        return this.name;
    }

    public int getXp(){
        return this.Xp;
    }

    public void setXp(int Experience){
        this.Xp = Experience;
    }

    public int getlvl(){
        return this.lvl;
    }

    public void setlvl(int Level){
        this.lvl = Level;
    }

    public int getWeaponValue(){return this.weaponValue;}

    public int getArmorValue() {
        return armorValue;
    }

    public int getUtilValue() {
        return utilValue;
    }

    public void setWeaponValue(int weaponValue){
        this.weaponValue = weaponValue;
    }
    public void setArmorValue(int armorValue){
        this.armorValue = armorValue;
    }

    public void setUtilValue(int utilValue) {
        this.utilValue = utilValue;
    }

    public void checkXp(){
        if (this.Xp == 100) {
            setlvl(this.lvl+1);
            this.Xp = 0;
        }
    }

    public boolean checkHP(){
        if (this.HP <= 0){
            return true;
        }
        return false;
    }

}
