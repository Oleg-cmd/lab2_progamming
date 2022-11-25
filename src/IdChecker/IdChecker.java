package IdChecker;

import java.util.ArrayList;
import java.util.Objects;

class DamException extends Exception{
    public String toString()
    {
        return "Error. No such person!";
    }
}

public class IdChecker{
    ArrayList<Object> myModels;
    public void take(ArrayList<Object> models){
        myModels = models;
    }
    public String check(String publicID){
        try{
            for (Object person : myModels){
                String[] lines = person.toString().split(System.getProperty("line.separator"));
//            System.out.println(lines[1]);
                if(Objects.equals(lines[1], publicID)){
//                System.out.println(lines[0]);
                    return lines[0];
                }
            }
            throw new DamException();

        }
        catch (DamException e){
            String myState = "Exception: " + e.toString();

            System.out.println(myState);
            return myState;
        }
    }
}
