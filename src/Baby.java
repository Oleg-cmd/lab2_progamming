import abstracted.Sounds;
import moves.Baby.KeepUp;

import java.util.UUID;

public class Baby extends Sounds {
    public int speed = 0;

    public String uniqueID = UUID.randomUUID().toString();
    private String ID = UUID.randomUUID().toString();

    public String myKeep = new KeepUp().keepUp(speed);

    public void Do(String arg){
        System.out.println(arg);
    }


}
