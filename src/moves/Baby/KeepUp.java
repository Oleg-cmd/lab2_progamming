package moves.Baby;

public class KeepUp {
    String myState;
    public String keepUp(Integer speed){
        speed = 50;
        myState = "Малыш еле поспевает со скоростью " + Integer.toString(speed);

        return myState;
    }
}
