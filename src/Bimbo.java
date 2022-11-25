

import abstracted.Sounds;
import moves.Bimbo.Anon;
import moves.Bimbo.Gallop;
import moves.Bimbo.Output;
import moves.Bimbo.Yelp;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

public class Bimbo extends Sounds {
    public int speed = 0;
    public String how = "бешено";
    public Double intensity = 0.0;

    public String uniqueID = UUID.randomUUID().toString();
    private UUID ID = UUID.randomUUID();

    public String gallop = new Gallop().gallop(speed);
    public String yelp = new Yelp().yelp(how, intensity);

    public String out = new Output().out();



    public void Do(String arg){
        System.out.println(arg);
    }
}
