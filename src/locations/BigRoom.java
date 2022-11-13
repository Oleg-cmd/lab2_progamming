package locations;

interface Room{
    String size = "";
    Integer mSquare = 0;
    String furniture = "";
}

public class BigRoom implements Room {
    public String size = "Big";
    Integer mSquare = 100;
    String furniture = "Диван, шкаф, стол, 4 стула, тумбочка, кровать, телевизор";

    String pretty = "kind of ugly";
    Integer storyCounter = 1;

    String myState = "";
    public String getToBigRoom(String who){
        myState = who + " Приходит в большую комнату";

        return myState;
    }

    public void giveInfo(String args){
        System.out.println(args);
    }

}
