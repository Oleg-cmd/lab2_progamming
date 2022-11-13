

import abstracted.Sounds;
import moves.Bimbo.Gallop;
import moves.Bimbo.Yelp;

import java.util.UUID;

public class Bimbo extends Sounds {
    public int speed = 0;
    public String how = "бешено";
    public Double intensity = 0.0;

    public String uniqueID = UUID.randomUUID().toString();
    private String ID = UUID.randomUUID().toString();

    public String gallop = new Gallop().gallop(speed);
    public String yelp = new Yelp().yelp(how, intensity);

    public void Do(String arg){
        System.out.println(arg);
    }
}
