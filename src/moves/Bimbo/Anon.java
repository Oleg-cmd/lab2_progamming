package moves.Bimbo;

import java.util.concurrent.atomic.AtomicReference;

public class Anon {
    public Anon(){}

    public static void main(String[] args){
        AtomicReference<String> myState = new AtomicReference<>("");
        Runnable outerPlusMethod;

        outerPlusMethod = () -> {
            myState.set("anonymous bimbo love secrets");
            System.out.println(myState);
        };
        outerPlusMethod.run();
    }
}
