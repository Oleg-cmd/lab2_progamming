package moves.Karl;

import java.util.List;

import java.util.List;

public class FlyOut {
    public String flyOut(Integer speed,Double pleasure , List<String> actionMoves, List<String> listOfMoves){
        speed = 80;
        pleasure = 0.9;

        actionMoves.remove(0);
        actionMoves.add(listOfMoves.get(5));
        actionMoves.add(listOfMoves.get(2));
        actionMoves.add(listOfMoves.get(3));

        String myState =  "Карлсон летит co скоростью " + Integer.toString(speed) + ",кудахчет и визжит от удовольствия на " + Double.toString(pleasure*100) + "%";
//        System.out.println(myState);
        return myState;
    }
}

