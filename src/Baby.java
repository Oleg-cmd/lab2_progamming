import abstracted.Sounds;
import moves.Baby.KeepUp;
import moves.Baby.Last;
import moves.Baby.Sleep;
import moves.Baby.WhileHah;

import java.util.UUID;

public class Baby extends Sounds {
    public int speed = 0;

    public String uniqueID = UUID.randomUUID().toString();
    private UUID ID = UUID.randomUUID();

    public String myKeep = new KeepUp().keepUp(speed);

    public String myWhileHah = new WhileHah().whileHah();

    public String myLast = new Last().last("глядя");

    public String babyEvent() {
        String myState = "";
        System.out.println("Малыш: Уже третий раз в моей комнате!");
        String myRoom = new Sleep().sleep();
        myState = myRoom;
        return myState;
    }

    public void Do(String arg){
        System.out.println(arg);
    }



}