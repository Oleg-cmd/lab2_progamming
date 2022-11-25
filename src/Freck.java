import abstracted.Sounds;
import moves.Freck.*;


import java.util.UUID;

public class Freck extends Sounds {
    public int speed = 0;

    private String[] freckState = new String[] {"Full energy","A little bit tired", "Tired of this life", "No time"};

    public double swingActions = 0;

    public String uniqueID = UUID.randomUUID().toString();
    private UUID ID = UUID.randomUUID();

    public String mySwing = new Swing().swing(swingActions);

    public Boolean myReady = new Ready().ready();
    public String myRush = new Rush().rush(speed);

    public String myChain = new GotOffTheChain().gotOffTheChain();

    public String myPuh = new Jump().jump(freckState[1]);
    public String myNude = new Jump().jump(freckState[3]);
    public String mySurrender = new Jump().jump(freckState[2]);



    public void Do(String arg){
        System.out.println(arg);
    }


}
