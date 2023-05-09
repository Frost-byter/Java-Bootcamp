package Week10;

public final class WaterBottle {

    public static void main (String[] args){


    }
    private static Object WaterBottle = new Object();

    private static WaterBottle instance = null;

    private int liters;

    private WaterBottle(){
        this.liters = 4;
    }

    private WaterBottle(int liters){
        this.liters = liters;
    }

    public static WaterBottle getInstance(){
        synchronized (WaterBottle){
            if (instance == null){
                instance = new WaterBottle();
            }
            return instance;
        }
    }

    public int getliters(){
        return this.liters;
    }

    public void wrapping(){

        System.out.println("Land o Lakes water");
    }

    public void coldness(){

        System.out.println("below freezing");
    }


}
