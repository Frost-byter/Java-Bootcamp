package Week6.RankingAtheletes;

import java.util.ArrayList;
import java.util.Comparator;

public class Athletes {

    private String name;
    private double winRate;
    private int game;
    private int wins;
    private int loses;

//    private Object nameB;
//    private int winRateB;
//    private int gamesB;
//    private int WinsB;
//    private int LosesB;
//
//    static Athletes Angel = new Athletes();
//    static Athletes Caitlin = new Athletes();
//
//    Athletes AthleteA = Angel;
//    Athletes AthleteB = Caitlin;


    public static void main(String[] args){

        Athletes Angel = new Athletes("Angel",40, 10);
        Athletes Caitlin = new Athletes("Caitlin",20, 30);
        Athletes John = new Athletes("john", 10, 12);

        ArrayList<Athletes> AthletesList = new ArrayList<>();
            AthletesList.add(Angel);
            AthletesList.add(Caitlin);
            AthletesList.add(John);

        Athletes.AthletesComparator comparator = new AthletesComparator();
        System.out.println(AthletesList);
        AthletesList.sort(comparator);
        System.out.println(AthletesList);
    }



    public Athletes(String name, int wins, int loses) {


        this.name = name;

        this.winRate = (double)wins / ( wins + loses) * 100;

        this.game = wins + loses;

        this.wins = wins;

        this.loses = loses;





    }

    public String getname(){
        return  this.name;
    }

    public void setname(String name){
        this.name = name;
    }

    public double getwinRate(){
        return this.winRate;
    }


    public int getwins(){
        return this.wins;
    }


    public int getLoses(){
        return this.loses;
    }


    public int getgame(){
        return this.game;
    }

    public static class AthletesComparator implements Comparator<Athletes> {
        @Override
        public int compare(Athletes a1, Athletes a2) {
            Double a1winRate = a1.getwinRate();
            Double a2winRate = a2.getwinRate();
            return a2winRate.compareTo(a1winRate);
        }
    }

    @Override
    public String toString(){

        return  "name: " + name + " winrate: " + winRate;
    }

}
