package v1;

public class ESPNWebsite implements Observer{
    @Override
    public void update(Subject subject) {

        if (subject instanceof NBAGame) {
            System.out.println("<<ESPN.com>>");
            System.out.println("The game data has been updated!");
            System.out.println("Game Name: " + ((NBAGame)subject).getName());
            System.out.println("Game Score: " + ((NBAGame)subject).getScore());
        }
    }
}
