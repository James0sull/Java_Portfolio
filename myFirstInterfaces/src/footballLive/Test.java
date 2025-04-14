package footballLive;



public class Test {
    public static void main(String[] args) {
        // Create an instance of FootballMatch
        FootballMatch game = new FootballMatch();

        // Create two instances of MobilePhoneListener
        MobilePhoneListener mob1 = new MobilePhoneListener("01234567");
        MobilePhoneListener mob2 = new MobilePhoneListener("09876543");

        // Register the mobile phone listeners with the football match.
        // We use the instance variable "game" dot the method "addListener"
        // which is within the same class and takes one parameter to add to the ArrayList
        game.addListener(mob1);
        game.addListener(mob2);

        // Start the match and simulate various events such as goals, fouls, and end of match.
        game.startMatch();
        game.simulateGoal("Dublin", 12);
        game.simulateFoul("Galway", 21);
        game.endMatch();

    }
}
