package moves.Karl;

public class Rejoice {
    public String rejoice(String whatDoing){
        String myState = "";
        myState = "Карлсон, " + whatDoing +", кружил вокруг лампы";

        return myState;
    }

    public static class RejoiceLevel {
        public static String getRejoiceLevel() {
            return  "My rejoice level is 5";
        }
    }
}
