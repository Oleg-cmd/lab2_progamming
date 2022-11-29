package IdChecker;

public class ErrorLocal {
//    stackOverflowError
    public static void main(String[] args){
        recursive(10);
    }

    public static void recursive(int i){
        while(i != 0){
            i = i+ 1;
            System.out.println(i);
            recursive(i);

        }
    }
}
