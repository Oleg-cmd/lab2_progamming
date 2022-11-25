import IdChecker.IdChecker;
import IdChecker.getIds;


import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

//        init

        Karlson Karl = new Karlson();
        Freck freck = new Freck();
        Baby baby = new Baby();
        Bimbo bimbo = new Bimbo();
        getIds Ids = new getIds();

        ArrayList<Object> models= Ids.ids(Karl.uniqueID, freck.uniqueID, baby.uniqueID, bimbo.uniqueID);


        IdChecker checker = new IdChecker();
//        func
        checker.take(models);

        freck.Do(freck.myChain);

        Karl.Do(Karl.myRush);
        Karl.Do(Karl.myFly);
        Karl.Do(Karl.myRejoice);
        Karl.Do(Karl.myRejoiceLevel);
        Karl.Do(Karl.getSound(Karl.sound));


        freck.Do(freck.myRush);
        freck.Do(freck.getSound(freck.sound));


        baby.Do(baby.myKeep);
        baby.Do(baby.getSound(baby.sound));

        bimbo.Do(bimbo.gallop);
        bimbo.Do(bimbo.yelp);
        bimbo.Do(bimbo.out);
        bimbo.Do(bimbo.getSound(bimbo.sound));

//                some checks

        if(freck.myReady){
            freck.Do(freck.mySwing);
            Karl.Do(Karl.mySoar);
        }

//        func

        freck.Do(freck.myPuh);
        freck.Do(freck.myNude);
        freck.Do(freck.mySurrender);

        baby.Do(baby.myWhileHah);
        baby.Do(baby.babyEvent());
        baby.Do(baby.myLast);

//        checking work of equals()
        Karl.Do(Karl.equals(baby.uniqueID, checker, models));
    }


}