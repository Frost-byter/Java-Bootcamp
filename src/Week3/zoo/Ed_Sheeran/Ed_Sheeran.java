package Week3.zoo.Ed_Sheeran;

public class Ed_Sheeran{

    protected String artist = "Ed Sheeran";
    public void sing(){
        System.out.println("I'm in love with the shape of you!");

    }
}

class song extends Ed_Sheeran{
    protected String songName = "Shape of you!";
    public static void main(String[] args){

        song songName = new song();
        songName.sing();
        System.out.println(songName.artist + ": " + songName.songName);

    }
}

