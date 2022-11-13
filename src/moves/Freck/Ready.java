package moves.Freck;

public class Ready {
    public Boolean ready(){
        System.out.println("Frecken Bok готовиться чтобы схватить Карлсона");
        for (int i =0; i < 100; i += 10){
            System.out.println("Я готова на " + Integer.toString(i) + "%");
            if(i == 90){
                System.out.println("Я готова на 100" + "%");
                break;
            }
        }
        return Boolean.TRUE;
    }
}
