package locations;


interface Flat{
    String size = "";
    Integer mSquare = 0;
    String furnitureGlobal = "";
    Integer howManyRooms = 0;
}


public class CurrentFlat implements Flat {
    public String size = "Big";
    Integer mSquare = 100;
    String furnitureGlobal = "Диван, шкаф, стол, 4 стула, тумбочка, кровать, телевизор, кружки, вилки и тд и тп";

    Integer howManyRooms = 4;
    String pretty = "pretty";
    Integer storyCounter = 1;

    Integer howManyGuys = 4;

    String myState = "";
    public String getToFlat(String who){
        myState = who + " Приходит в эту квартиру";

        return myState;
    }

    public String getOutOfFlat(String who){
        myState = who + " Выходит из этой квартиры квартиру";

        return myState;
    }

    public String getPeople(){
        return Integer.toString(howManyGuys);
    }

    public void giveInfo(String args){
        System.out.println(args);
    }
}
