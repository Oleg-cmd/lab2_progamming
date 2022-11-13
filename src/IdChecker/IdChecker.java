package IdChecker;

import java.util.ArrayList;
import java.util.Objects;

public class IdChecker{
    ArrayList<Object> myModels;
    public void take(ArrayList<Object> models){
        myModels = models;
    }
    public String check(String publicID){
        for (Object person : myModels){
            String[] lines = person.toString().split(System.getProperty("line.separator"));
//            System.out.println(lines[1]);
            if(Objects.equals(lines[1], publicID)){
//                System.out.println(lines[0]);
                return lines[0];
            }
        }
//        System.out.println("No such person!");
        return "No such person!";
    }
}
