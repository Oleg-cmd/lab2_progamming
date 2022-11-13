package moves.Karl;

import java.util.List;

public class Rush {
    public String rush(Integer speed, List<String> actionMoves, List<String> listOfMoves){
        speed = 100;
        actionMoves.remove(0);
        actionMoves.add(listOfMoves.get(1));
        String myState = "Карлсон метнулся co скоростью " +  Integer.toString(speed);

//        System.out.println(myState);
        return myState;
    }
}
