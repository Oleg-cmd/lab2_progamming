package moves.Freck;

public class Swing {
    String myState;
    public String swing(Double swingActions){
        swingActions = 1.0;

        myState = "Фрекен Бок размахивает дубинкой на " + Double.toString(swingActions*100) + "%";
        return myState;
    }
}
