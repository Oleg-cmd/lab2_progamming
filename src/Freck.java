import abstracted.Sounds;
import moves.Freck.Ready;
import moves.Freck.Rush;
import moves.Freck.Swing;

import java.util.UUID;

public class Freck extends Sounds {
    public int speed = 0;
    public double swingActions = 0;

    public String uniqueID = UUID.randomUUID().toString();
    private String ID = UUID.randomUUID().toString();

    public String mySwing = new Swing().swing(swingActions);
    public Boolean myReady = new Ready().ready();
    public String myRush = new Rush().rush(speed);

    public void Do(String arg){
        System.out.println(arg);
    }


}
