package moves.Freck;

public class SwingBefore {
    public String swingBefore(){
        String myState = "";
        myState = voice(myState) + grab(myState);
        return myState;
    }
    public String voice(String state){
        state = "Фрекен Бок Заорала не своим голосом \n";
        return state;
    }
    public String grab(String state){
        state = "Фрекен Бок Схватила выбивалку для ковров \n";
        return state;
    }
}
