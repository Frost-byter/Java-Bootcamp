package Week6;

import java.util.ArrayList;

public class Programmer {
    private String name;
    private String Company;
    private ArrayList<String> Lang;


    public static void main(String[]args){
        ArrayList<String> Lang = new ArrayList<>();
        Lang = add(Lang, null);

        Programmer Programmer = new Programmer();

        System.out.println("Name: " + Programmer.getName() + "Company: " + Programmer.getCompany()
                + "Languages: " + Programmer.getLang());

    }

    //null check
    public static ArrayList<String> add(ArrayList<String> Lang, String str){
        if(Lang != null){
            Lang.add(str);
            return Lang;
        } else {
            return Lang;
        }
    }


    public Programmer() {

        Programmer Programmer = new Programmer();

        Programmer.getName();
        Programmer.getCompany();
        Programmer.getLang();
        Programmer.toString();
        
        this.name = name.trim();
        this.Company = Company.trim();
        this.Lang = Lang;

        Lang.add("Python");
        Lang.add("Coral");
        Lang.add("HTML");
        Lang.add("CORBAL");



    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return this.Company;
    }

    public void setCompany(String Company){
        this.Company = Company;
    }

    public ArrayList<String> getLang(){
        return this.Lang;
    }

    public void setLang(ArrayList<String> Lang){
        this.Lang = Lang;
    }

    @Override
    public String toString(){
        return  "name: " + name +
                "Company: " + Company +
                "Languages: " + Lang;
    }

}



