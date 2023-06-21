package v1;

public class PolyPost implements Observer{

    @Override
    public void update(Subject subject) {
        if(subject instanceof NBAGame){
            System.out.println("****** POLY POST HEADLINES ******");
            System.out.println(((NBAGame)subject).getName());
            System.out.println(((NBAGame)subject).getScore());
            System.out.println("*********************************");
        }

        if (subject instanceof LAPoll){
            System.out.println("****** POLY POST UPDATE ******");
            System.out.println(((LAPoll)subject).getName());
            System.out.println(((LAPoll)subject).getPercent());
            System.out.println("*********************************");

        }
    }
}
