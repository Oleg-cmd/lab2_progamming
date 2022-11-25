package moves.Freck;

public class Jump{
    public String jump(String freckState){

        String myState = "";

        if (freckState.equals("A little bit tired")){
            myState = "Фрекен Бок запыхалась, но продолжала подпрыгивать, и ее большие босые ноги шлепали по паркету";
        }
        if(freckState.equals("No time")){
            myState = "Фрекен бок: Нет времени обуваться, бежим!";
        }

        if(freckState.equals("Tired of this life")){
            myState = "Фрекен бок: Не сдамся!";
        }

        if (myState.equals("")){
            myState = "Фрекен бок не готова выполнить это действие";
        }
        return myState;
    }


}
