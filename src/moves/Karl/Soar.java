package moves.Karl;

import java.util.List;

public class Soar {
    public String soar(Integer speed, Double pleasure, List<String> actionMoves, List<String> listOfMoves, Boolean isFreck, Boolean ready){
        String myState;

        if (isFreck && ready){
            speed = 90;
            pleasure = 0.7;

            actionMoves.remove(1);
            actionMoves.remove(2);
            actionMoves.add(listOfMoves.get(4));

            myState = "Карлсон взмывает";

//            System.out.println(myState);
            return myState;
        }
        myState = "Это была не фрекен бок, можно не взмывать";

//        System.out.println(myState);
        return myState;
    }
}
