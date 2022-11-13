package IdChecker;


public class who {
    String name;
    String id;


    public String getName(){
        return this.name;
    }


    public String getId(){
        return this.id;
    }


    @Override
    public String toString() {
        String str = this.name + '\n' + this.id;
        return str;
    }

}
