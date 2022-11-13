package IdChecker;

import java.util.ArrayList;

public class getIds {

    public ArrayList<Object> ids(String Karl_id, String Freck_id, String Baby_id, String Bimbo_id){
        who Karl = new who();
        Karl.id = Karl_id;
        Karl.name = "Karlson";


        who Freck = new who();
        Freck.id = Freck_id;
        Freck.name = "Frecken Bok";

        who Baby = new who();
        Baby.id = Baby_id;
        Baby.name = "Baby";

        who Bimbo = new who();
        Bimbo.id = Bimbo_id;
        Bimbo.name = "Bimbo";

        ArrayList<Object> myList = new ArrayList<>();

        myList.add(Karl);
        myList.add(Freck);
        myList.add(Baby);
        myList.add(Bimbo);

        return myList;

    }
}
