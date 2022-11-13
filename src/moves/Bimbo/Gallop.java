package moves.Bimbo;

public class Gallop {
    String myState;
    public String gallop( Integer speed){
        speed = 40;

        myState = "Бимбо скачет со скоростью " + Integer.toString(speed);
        return myState;
    }
}
