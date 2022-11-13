package moves.Bimbo;

public class Yelp {
    String myState;
    public String yelp(String how, Double Intensity){
        Intensity = 0.8;
        myState = "Бимбо " + how + " тявкает с интесивностью в " +  Double.toString(Intensity*100) + "%";

        return myState;
    }
}
