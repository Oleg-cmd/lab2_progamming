import abstracted.Sounds;
import moves.Karl.FlyOut;
import moves.Karl.Rejoice;
import moves.Karl.Rush;
import moves.Karl.Soar;

import java.util.*;


public class Karlson extends Sounds {
    public static int speed = 0;
    public static double pleasure = 0.0;
    public String uniqueID = UUID.randomUUID().toString();
    private UUID ID = UUID.randomUUID();

    // ничего не делать, метнуться кудахтать, визжать, взмывать
    public String[] carlMoves = new String[] {"Stay","Rush", "Cackle", "Squeal", "Soar", "Fly"};

//    задать массив с ограниченным количествомgfvznb
//    сделать StackOverflowErorr
//public class App {
//    public static void main(String[] args) {
//        f();
//    }
//    public static void f() throws RuntimeException {
//    }
//}
    public List<String> listOfMoves = new ArrayList<>(Arrays.asList(carlMoves));

    public String[] carlAction = new String[] {"Stay"};
    public List<String> actionMoves = new ArrayList<>(Arrays.asList(carlMoves));


    public String myRush = new Rush().rush(speed, actionMoves, listOfMoves);
    public String myFly = new FlyOut().flyOut(speed, pleasure, actionMoves, listOfMoves);
    public String mySoar = new Soar().soar(speed, pleasure, actionMoves, listOfMoves, Boolean.TRUE, Boolean.TRUE);

    public String myRejoice = new Rejoice().rejoice("ликуя");
    public String myRejoiceLevel = new Rejoice.RejoiceLevel().getRejoiceLevel();

    public void Do(String arg){
        System.out.println(arg);
    }



}
