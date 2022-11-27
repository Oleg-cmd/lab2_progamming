package IdChecker;

public class Error {
//    stackOverflowArror
    public static void main(String[] args){
        recursive(10);
    }

    public static void recursive(int i){
        while(i != 0){
            i = i+ 1;
            recursive(i);
        }
    }
}
