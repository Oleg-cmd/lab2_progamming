import IdChecker.IdChecker;
import IdChecker.getIds;


import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        Karlson Karl = new Karlson();
        Freck freck = new Freck();
        Baby baby = new Baby();
        Bimbo bimbo = new Bimbo();

        getIds Ids = new getIds();
        ArrayList<Object> models= Ids.ids(Karl.uniqueID, freck.uniqueID, baby.uniqueID, bimbo.uniqueID);


        IdChecker checker = new IdChecker();
        checker.take(models);


        Karl.Do(Karl.myRush);
        Karl.Do(Karl.myFly);
        Karl.Do(Karl.getSound(Karl.sound));

        freck.Do(freck.myRush);
        freck.Do(freck.getSound(freck.sound));


        baby.Do(baby.myKeep);
        baby.Do(baby.getSound(baby.sound));

        bimbo.Do(bimbo.gallop);
        bimbo.Do(bimbo.yelp);
        bimbo.Do(bimbo.getSound(bimbo.sound));

        if(freck.myReady){
            freck.Do(freck.mySwing);
            Karl.Do(Karl.mySoar);
        }

//        checking work of equals()

        Karl.Do(Karl.equals(baby.uniqueID, checker, models));
    }


}