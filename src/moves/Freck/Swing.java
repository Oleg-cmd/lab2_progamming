package moves.Freck;
public class Swing extends SwingBefore{
    public String swing(Double swingActions){
        swingActions = 1.0;
        String myState = swingBefore() + "Фрекен Бок размахивает дубинкой на " + Double.toString(swingActions*100) + "% \n";

        String smthExtra = new SwingExtra().TODO();

        myState = myState + smthExtra;

        return myState;
    }

    public class SwingExtra{
        public String TODO(){
            String myState = "";

            myState = "I am non-static SWING-EXTRA what u wanna do now *******";

            return myState;

        }
    }
}
